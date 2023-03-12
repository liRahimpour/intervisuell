#!/bin/sh

#set environment
source ./env_unx

# maven build backend
cd ../intervisuell
mvn clean install -DskipTests
STATUS=$?
if [ $STATUS -eq 0 ]; then
  echo ""
  echo "- - - - Creation of iv-components successful - - - -"
  echo ""
else
  echo "Creation of iv-components Failed!"
  exit
fi

# create iv-network if not exists
if [ -z $(docker network ls --filter name=^iv-network$ --format="{{ .Name }}") ]
then
  echo "Creating iv-network..."
  docker network create iv-network
else
  echo "iv-network already exists, skipping creation."
fi

cd ../iv-dev-dockercompose

# tear down all existing containers
docker-compose -p iv -f docker-compose.yml down -v

# startup all containers
docker-compose -p iv -f docker-compose.yml up --build --remove-orphans -d

# cleanup matured stuff
if [ $? -eq 0 ]
then
  docker container prune -f
  docker image prune -a -f
fi
