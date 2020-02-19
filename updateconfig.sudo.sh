#!/bin/sh

IMAGE_NAME=

A=$(sudo docker ps | grep ${IMAGE_NAME} | sed -n 1p | cut -d " " -f 1)
B=$(sudo docker ps | grep ${IMAGE_NAME} | sed -n 2p | cut -d " " -f 1)
C=$(sudo docker ps | grep ${IMAGE_NAME} | sed -n 3p | cut -d " " -f 1)
D=$(sudo docker ps | grep ${IMAGE_NAME} | sed -n 4p | cut -d " " -f 1)
E=$(sudo docker ps | grep ${IMAGE_NAME} | sed -n 5p | cut -d " " -f 1)
F=$(sudo docker ps | grep ${IMAGE_NAME} | sed -n 6p | cut -d " " -f 1)
G=$(sudo docker ps | grep ${IMAGE_NAME} | sed -n 7p | cut -d " " -f 1)

echo $A
echo $B
echo $C
echo $D
echo $E
echo $f
echo $G

sudo docker stop $A;
sudo docker start $A;

sleep 10;

sudo docker stop $B;
sudo docker start $B;

sleep 10;

sudo docker stop $C;
sudo docker start $C;

sleep 10;

sudo docker stop $D;
sudo docker start $D;

sleep 10;

sudo docker stop $E;
sudo docker start $E;

sleep 10;

sudo docker stop $F;
sudo docker start $F;

sleep 10;

sudo docker stop $G;
sudo docker start $G;