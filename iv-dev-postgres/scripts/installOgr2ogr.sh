#!/bin/bash

apt-get update
apt-get install -y gdal-bin
sleep 2
ogr2ogr --version
