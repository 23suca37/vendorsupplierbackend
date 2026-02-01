# Use lightweight Java image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy the Spring Boot jar
COPY target/vendorsupplier-0.0.1-SNAPSHOT.jar app.jar

# Expose the port used by Spring Boot
EXPOSE 8081

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]