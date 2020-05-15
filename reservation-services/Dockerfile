FROM openjdk:8

COPY target/reservation-services*.jar /opt/reservation-services.jar
WORKDIR /opt

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "reservation-services.jar"]

