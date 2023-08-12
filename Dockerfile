FROM eclipse-temurin:17-jdk-jammy
COPY target/app.jar /app.jar
# This is the port that your javalin application will listen on
EXPOSE 7070
CMD ["java", "-jar", "/app.jar"]