#!/bin/sh

# Globale Variable
ROT='\033[0;31m'
BLAU='\033[0;34m'
GELB='\033[1;33m'
NC='\033[0m' # No Color

# Get a list of Docker volumes that are dangling (not associated with any container)
VOLUMES=$(docker volume ls -qf "dangling=true")
# Calculate the timestamp for 2 months ago and convert it to seconds since the epoch
TWO_MONTHS_AGO=$(date -j -v -2m "+%s")

sep()
{
echo " "
echo "${BLAU}  ###########################################################${NC}"
echo "${GELB}  $1${NC}"
echo " "
}

err()
{
echo " "
echo "${ROT}  ###########################################################${NC}"
echo "${ROT}  $1${NC}"
echo " "
}

#set environment vars.
. ./env_unx

sep "maven build backend"
# maven build backend
cd ../intervisuell || exit
mvn clean install -DskipTests
STATUS=$?
if [ $STATUS -eq 0 ]; then
  sep "Creation of Backend successful"
else
  err "Creation of backend Failed!"
  exit
fi

sep "create iv-network if not exists for Docker environment"
# create iv-network if not exists for Docker environment
if [ -z "$(docker network ls --filter name=^iv-network$ --format='{{ .Name }}')" ]
then
  sep "Creating iv-network..."
  docker network create iv-network
else
  sep "iv-network already exists, skipping creation."
fi

sep "set the Working Directory"
# set the Working Directory
cd ../iv-dev-dockercompose || exit

sep "tear down all existing containers"
# tear down all existing containers
docker-compose -p iv -f docker-compose.yml down -v

sep "startup all containers (Modules/Services)"
# startup all containers (Modules/Services)
docker-compose -p iv -f docker-compose.yml up --build --remove-orphans -d

sep "cleanup matured Docker-stuff (containers, Unused images)"
# cleanup matured Docker-stuff (containers, Unused images)
if ! docker container prune -f || ! docker image prune -a -f;
then
  err "Cleanup of matured Docker-stuff (containers, Unused images) NOT successful"
else
  sep "Cleanup of matured Docker-stuff (containers, Unused images) successful"
fi

sep "cleanup matured Docker-Volumes"
for VOL in $VOLUMES; do
  # Get the volume creation date
  VOL_INFO=$(docker volume inspect "$VOL")
  # Extract the date from the output
  VOL_DATE=$(echo "$VOL_INFO" | awk -F'"' '/CreatedAt/{print $4}' | cut -d'T' -f1)
  # Convert the date to a timestamp
  VOL_TIMESTAMP=$(date -j -f "%Y-%m-%d" "$VOL_DATE" "+%s")

  # If the volume is older than 2 months, remove it
  if [ "$VOL_TIMESTAMP" -lt "$TWO_MONTHS_AGO" ]; then
    docker volume rm "$VOL"
  fi
done