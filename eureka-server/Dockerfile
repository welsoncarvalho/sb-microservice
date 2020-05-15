FROM openjdk:8

COPY target/eureka-server*.jar /opt/eureka-server.jar
WORKDIR /opt

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "eureka-server.jar"]

