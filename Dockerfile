FROM amazoncorretto:11-alpine-jdk

MAINTAINER diegocata

copy target/tk-0.0.1-SNAPSHOT.jar diegocat-app.jar 

ENTRYPOINT ["java","-jar","/diegocat-app.jar"]
