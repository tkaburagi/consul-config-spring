#!/bin/sh

cd web-backend-consul 

./mvnw clean package -DskipTests

cd ..

docker-compose build --no-cache

consul agent -server -bind=0.0.0.0 \
-client=0.0.0.0 \
-data-dir=/Users/kabu/hashicorp/consul/config-demo-data \
-bootstrap-expect=1 -ui \
-config-dir=/Users/kabu/hashicorp/intellij/springboot-consul-config/consul_config/consul-config.hcl &

docker-compose up