FROM openjdk:8-jre-alpine

MAINTAINER wangjing@siemens.com
ADD target/edge-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 8087
ENTRYPOINT ["java","-Dserver.port=8087","-jar","app.jar"]