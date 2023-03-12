FROM postgres:latest

ADD initdb /docker-entrypoint-initdb.d
RUN chmod +x /docker-entrypoint-initdb.d/*.sh
