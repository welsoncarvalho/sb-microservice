FROM openjdk:8

COPY target/reservation-business-services*.jar /opt/reservation-business-services.jar
WORKDIR /opt

ENTRYPOINT ["java", "-jar", "reservation-business-services.jar"]

