#
# Build stage
#
FROM maven:3.8.6-openjdk-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean install

#
# Package stage
#
FROM eclipse-temurin:21-jdk
COPY --from=build /app/target/sb1-0.0.1-SNAPSHOT.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/demo.jar"]
