FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests
FROM OPENJDK:17.0.1-jdk-slim
COPY --from=build /target/quiz-app-0.0.1-SNAPSHOT.jar quiz-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-java","quiz-app.jar"]

