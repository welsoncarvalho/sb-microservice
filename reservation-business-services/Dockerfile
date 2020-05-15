FROM openjdk:8

COPY target/reservation-business-services*.jar /opt/reservation-business-services.jar
COPY wait-for-it.sh /opt/wait-for-it.sh

WORKDIR /opt
RUN chmod +x wait-for-it.sh

ENTRYPOINT ["./wait-for-it.sh", "config-server-docker:9000", "-t", "180", "--", "java", "-jar", "reservation-business-services.jar"]

