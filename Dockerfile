# Use the official Eclipse Temurin 8 base image
FROM adoptopenjdk:8-jdk-hotspot

# Set the working directory inside the container
WORKDIR /app

# Copy the Selenium script and any required dependencies to the container
COPY . /app

# Download and install the appropriate WebDriver for the desired browser (e.g., Chrome)
RUN apt-get update && apt-get install -y curl unzip \
    && curl -sS -o chromedriver_win32.zip https://chromedriver.storage.googleapis.com/104.0.5112.29/chromedriver_win32.zip \
    && unzip chromedriver_win32.zip \
    && rm chromedriver_win32.zip \
    && mv chromedriver.exe /usr/local/bin \
    && chmod +x /usr/local/bin/chromedriver.exe


# Install Maven
RUN apt-get update && apt-get install -y maven

RUN mvn clean install

# Set the entry point for running the tests
CMD ["mvn", "verify"]