FROM openjdk:17
WORKDIR /app
COPY target/backend.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
