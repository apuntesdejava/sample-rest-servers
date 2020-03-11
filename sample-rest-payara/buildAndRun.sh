#!/bin/sh
mvn clean package && docker build -t com.apuntesdejava.payara/sample-rest-payara .
docker rm -f sample-rest-payara || true && docker run -d -p 8080:8080 -p 4848:4848 --name sample-rest-payara com.apuntesdejava.payara/sample-rest-payara 
