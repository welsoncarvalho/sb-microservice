FROM openjdk:8

COPY target/guest-services*.jar /opt/guest-services.jar
WORKDIR /opt

ENTRYPOINT ["java", "-jar", "guest-services.jar"]

