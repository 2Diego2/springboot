FROM amazoncorretto:11-alpine-jdk

MAINTAINER emaaristimuno

copy C:\Users\germa\Documents\Proyectos\tk\targettk-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/tk-0.0.1-SNAPSHOT.jar"]
