FROM amazoncorretto:11-alpine-jdk

MAINTAINER emaaristimuno

copy  /Users/germa/Documents/Proyectos/tk/target/tk-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/tk-0.0.1-SNAPSHOT.jar"]
