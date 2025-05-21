# Use a lightweight OpenJDK image
FROM eclipse-temurin:17-jdk-jammy as base

# Set working directory inside the container
WORKDIR /app

# Copy the Spring Boot fat JAR (update the name accordingly)
COPY build/libs/HealthCheckService-0.0.1.jar healthcheck.jar

# Expose port (match your application port, usually 8080)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "healthcheck.jar"]
