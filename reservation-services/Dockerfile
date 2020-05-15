FROM openjdk:8

COPY target/reservation-services*.jar /opt/reservation-services.jar
WORKDIR /opt

ENTRYPOINT ["java", "-jar", "reservation-services.jar"]

