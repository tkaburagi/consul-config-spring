#!/bin/sh

pkill consul

cd web-backend-consul 

./mvnw clean package -DskipTests

cd ..

consul agent -server -bind=127.0.0.1 \
-client=0.0.0.0 \
-bootstrap-expect=1 -ui \
-config-dir=./consul.d &

docker-compose build --no-cache

docker-compose up