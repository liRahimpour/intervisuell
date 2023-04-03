#!/bin/sh

dbname="db"
username="admin"
password="admin"
host="iv-postgres"
port="5432"
path="rlp-shape/gis_osm_buildings_a_free_1.shp"
table="test-table"


docker exec iv-postgres ogr2ogr \
  -f "PostgreSQL" \
  PG:"dbname=$dbname user=$username password=$password host=$host port=$port" \
  var/lib/postgresql/data/geodata/$path \
  -nln $table \
  -nlt PROMOTE_TO_MULTI \
  -lco GEOMETRY_NAME=geom

