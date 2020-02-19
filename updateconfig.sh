#!/bin/sh

A=$(docker ps | grep config_app | sed -n 1p | cut -d " " -f 1)
B=$(docker ps | grep config_app | sed -n 2p | cut -d " " -f 1)
C=$(docker ps | grep config_app | sed -n 3p | cut -d " " -f 1)
D=$(docker ps | grep config_app | sed -n 4p | cut -d " " -f 1)
E=$(docker ps | grep config_app | sed -n 5p | cut -d " " -f 1)
F=$(docker ps | grep config_app | sed -n 6p | cut -d " " -f 1)
G=$(docker ps | grep config_app | sed -n 7p | cut -d " " -f 1)

echo $A
echo $B
echo $C
echo $D
echo $E
echo $f
echo $G

docker stop $A;
docker start $A;

sleep 10;

docker stop $B;
docker start $B;

sleep 10;

docker stop $C;
docker start $C;

sleep 10;

docker stop $D;
docker start $D;

sleep 10;

docker stop $E;
docker start $E;

sleep 10;

docker stop $F;
docker start $F;

sleep 10;

docker stop $G;
docker start $G;