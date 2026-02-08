# Use Java 17 JDK
FROM eclipse-temurin:17-jdk

# Set working directory inside container
WORKDIR /app

# Copy project files
COPY . .

# Make Maven wrapper executable and build the JAR (skip tests for faster build)
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

# Expose Spring Boot default port
EXPOSE 8080

# Run the Spring Boot app
# Use wildcard to avoid updating JAR name every time
CMD ["sh", "-c", "java -jar target/*.jar"]
