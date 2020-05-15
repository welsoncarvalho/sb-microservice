FROM openjdk:8

COPY target/room-services*.jar /opt/room-services.jar
WORKDIR /opt

ENTRYPOINT ["java", "-jar", "room-services.jar"]

