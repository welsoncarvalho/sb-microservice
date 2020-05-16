# sb-cloud-microservice
Spring Boot - Microservice - Docker

Based on course "Spring: Spring Cloud" from Frank P. Moley.

The application is distributed is these modules:

- Room Services: microservices responsible for manage rooms
- Guest Services: microservices responsible for manage guests
- Reservation Services: microservices responsible for manage reservation
- Reservation Business Services: microservices responsible for business related to reservation, integrate with other services using eureka server
- Reservation WebApp: a simple web app to show informations about reservation

- Config Server: Spring Cloud Application to manage configurations to microservices.
- Eureka Server: Spring Eureka Server to discovery microservices.
