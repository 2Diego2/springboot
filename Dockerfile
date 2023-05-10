FROM amazoncorretto:11-alpine-jdk

MAINTAINER emaaristimuno

copy tk/target/tk-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/tk-0.0.1-SNAPSHOT.jar"]
