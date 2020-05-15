FROM openjdk:8

COPY target/reservation-webapp*.jar /opt/reservation-webapp.jar
WORKDIR /opt

EXPOSE 8600

ENTRYPOINT ["java", "-jar", "reservation-webapp.jar"]

