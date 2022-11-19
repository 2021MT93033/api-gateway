FROM openjdk:11
COPY target/api-gateway-0.0.1-SNAPSHOT.jar api-gateway-service.jar
ENTRYPOINT ["java", "-jar", "/api-gateway-service.jar"]