FROM openjdk:8

COPY target/reservation-webapp*.jar /opt/reservation-webapp.jar
COPY wait-for-it.sh /opt/wait-for-it.sh

WORKDIR /opt
RUN chmod +x wait-for-it.sh

EXPOSE 8600

ENTRYPOINT ["./wait-for-it.sh", "config-server-docker:9000", "-t", "180", "--", "java", "-jar", "reservation-webapp.jar"]

