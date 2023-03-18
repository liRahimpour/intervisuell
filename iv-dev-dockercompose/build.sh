#!/bin/sh

# Globale Variable
ROT='\033[0;31m'
BLAU='\033[0;34m'
GELB='\033[1;33m'
NC='\033[0m' # No Color

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

#set environment
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
if mycmd; then
  docker container prune -f
  docker image prune -a -f
fi
