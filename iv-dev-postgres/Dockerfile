FROM postgis/postgis:latest

# Kopieren des SQL-Skripts in den Container
COPY initdb/init-db.sql /docker-entrypoint-initdb.d/

# Optional: Kopieren von anderen Dateien oder Skripten, die für die Initialisierung benötigt werden

# Führen Sie den Befehl aus, um die Datenbank zu starten
#CMD ["docker-entrypoint.sh", "postgres"]