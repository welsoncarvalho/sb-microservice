FROM openjdk:8

COPY target/config-server*.jar /opt/config-server.jar
WORKDIR /opt

EXPOSE 9000

ENTRYPOINT ["java", "-jar", "config-server.jar"]
