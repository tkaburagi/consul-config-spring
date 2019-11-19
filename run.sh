#!/bin/sh

cd web-backend-consul 

./mvnw clean package -DskipTests

cd ..

docker-compose build --no-cache

consul agent -server -bind=0.0.0.0 \
-client=0.0.0.0 \
-data-dir=${DATA_DIR} \
-bootstrap-expect=1 -ui \
-config-dir=${CONFIG_DIR}/consul-config.hcl &

docker-compose up