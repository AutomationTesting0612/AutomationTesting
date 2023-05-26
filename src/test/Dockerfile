# Use the official Eclipse Temurin 8 base image
FROM adoptopenjdk:8-jdk-hotspot

# Set the working directory
WORKDIR /app

# Copy the Java project files to the container
COPY . /app

# Install Maven
RUN apt-get update && apt-get install -y maven

# Build the project with Maven
RUN mvn clean install

# Set the entry point for running the tests
CMD ["mvn", "test"]