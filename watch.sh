#!/bin/sh

watch -n 1 "curl -s 127.0.0.1:1010 ; echo ; curl -s 127.0.0.1:2020 ; echo ; curl -s 127.0.0.1:3030 ; echo ; curl -s 127.0.0.1:4040 ; echo ; curl -s 127.0.0.1:5050 ; echo ; curl -s 127.0.0.1:6060 ; echo ; curl -s 127.0.0.1:7070"
