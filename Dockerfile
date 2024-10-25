FROM ubuntu

RUN apt-get update && apt-get install wget -y
RUN mkdir /usr/app
WORKDIR /usr/app
#RUN cd workspace
COPY target/*.jar  /app/formatter-maven-plugin.jar
