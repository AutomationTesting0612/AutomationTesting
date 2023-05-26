# Use the official Eclipse Temurin 8 base image
FROM adoptopenjdk:8-jdk-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the Selenium script and any required dependencies to the container
COPY ./app

RUN cd /app

RUN ls -a

RUN chmod +x /app/chromedriver.exe

# Download and install the appropriate WebDriver for the desired browser (e.g., Chrome)
RUN apt-get update && apt-get install -y curl unzip


# Install Maven
RUN apt-get update && apt-get install -y maven

# Set the entry point for running the tests
CMD ["java", "-jar", "AutomationTesting-1.0-SNAPSHOT.jar"]

RUN mvn clean install