#!/bin/sh

cd web-backend-consul 

./mvnw clean package -DskipTests

cd ../web-front-consul 

./mvnw clean package -DskipTests

cd ..

docker-compose build --no-cache

docker-compose up