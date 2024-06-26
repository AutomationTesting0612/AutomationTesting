package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {

    Properties properties;

    public void utility () throws IOException {
        properties = new Properties();
        FileInputStream file =
                new FileInputStream("C:\\Users\\HP\\IdeaProjects\\AutomationTesting\\application.properties");
        properties.load(file);

    }

    public String getMobilrNumber() throws IOException {
        utility();
        String driverPath = properties.getProperty("mobileNumber");
        if(driverPath!= null) return driverPath;
        else throw new RuntimeException("mobileNumber not specified in the Configuration.properties file.");
    }

    public String getEnterMobileNumber() throws IOException {
        utility();
        String driverPath = properties.getProperty("enterMobileNumber");
        if(driverPath!= null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }

    public String clickOTPButton() throws IOException {
        utility();
        String driverPath = properties.getProperty("OTPButton");
        if(driverPath!= null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }
}
