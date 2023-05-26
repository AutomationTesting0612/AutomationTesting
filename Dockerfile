# Use the official Eclipse Temurin 8 base image
FROM adoptopenjdk:8-jdk-hotspot

#Step 1 : Install the pre-requisite
RUN apt-get update
RUN apt-get install -y curl
RUN apt-get install -y p7zip \
    p7zip-full \
    unace \
    zip \
    unzip \
    bzip2

#Version numbers
ARG CHROME_VERSION=113.0.4103.116
ARG CHROMDRIVER_VERSION=113.0.5672.126


#Step 2: Install Chrome
RUN curl http://dl.google.com/linux/chrome/deb/pool/main/g/google-chrome-stable/google-chrome-stable_$CHROME_VERSION-1_amd64.deb -o /chrome.deb
RUN dpkg -i /chrome.deb
RUN rm /chrome.deb

#Step 3: Install chromedriver for Selenium
RUN mkdir -p /app/bin
RUN curl https://chromedriver.storage.googleapis.com/$CHROMDRIVER_VERSION/chromedriver_linux64.zip -o /tmp/chromedriver.zip \
    && unzip /tmp/chromedriver.zip -d /app/bin/ \
    && rm /tmp/chromedriver.zip
RUN chmod +x /app/bin/chromedriver

# Download and install the appropriate WebDriver for the desired browser (e.g., Chrome)
RUN apt-get update && apt-get install -y curl unzip

RUN mvn clean install


# Install Maven
RUN apt-get update && apt-get install -y maven

# Set the entry point for running the tests
CMD ["java", "-jar", "AutomationTesting-1.0-SNAPSHOT.jar"]

