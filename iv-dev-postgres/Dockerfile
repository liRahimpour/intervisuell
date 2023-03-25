FROM postgis/postgis:latest

ADD initdb /docker-entrypoint-initdb.d
RUN chmod +x /docker-entrypoint-initdb.d/*.sh

#postgres mit instaliertem PostGIS : https://registry.hub.docker.com/r/postgis/postgis