FROM amazoncorretto:13-alpine-jdk

MAINTAINER diego

copy target/tk-0.0.1-SNAPSHOT.jar diego-app.jar 

ENTRYPOINT ["java","-jar","/diego-app.jar"]
