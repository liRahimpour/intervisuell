#!/bin/sh
#set environment vars.
. ./env_unx

docker-compose -p iv -f docker-compose.yml down -v

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