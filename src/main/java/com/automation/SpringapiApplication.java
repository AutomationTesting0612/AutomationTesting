package com.automation;

import com.automation.model.DataList;
import com.automation.model.DataSet;
import com.automation.model.ScenarioMain;
import com.automation.utils.ui.model.UIModel;
import com.automation.utils.ui.pom.DynamicWebAutomation;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

@SpringBootApplication
public class SpringapiApplication {

    private final List<ScenarioMain> receivedMessages = new ArrayList<>();

    private final List<UIModel> uiModelMessages = new ArrayList<>();
    private final ObjectMapper objectMapper = new ObjectMapper();

    private final RestTemplate restTemplate = new RestTemplate();

    private final KafkaTemplate kafkaTemplate;

    private static ExtentReports extent;
    private static ExtentTest test;

    ScenarioMain scenario;

    UIModel uiModel;

    String featureName = "Unknown Feature";
    String operationType = null;

    String url = null;
    String endpoint = null;

    private Map<String, String> header;

    private Map<String, Object> requestBody;

    public SpringapiApplication(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringapiApplication.class, args);
    }

    @KafkaListener(topics = "ui-actions", groupId = "your-group-id1")
    public void consumeMessage2(String message) {
        try {
            UIModel uiModel = objectMapper.readValue(message, UIModel.class);
            uiModelMessages.add(uiModel);
//            setupExtentReports();

            List<Map<String, String>> actionSequence = objectMapper.readValue(
                    objectMapper.writeValueAsString(uiModel.getActions()),
                    new TypeReference<List<Map<String, String>>>() {}
            );

            // Run automation dynamically
            DynamicWebAutomation automation = new DynamicWebAutomation(uiModel.getBrowser());

            automation.executeAutomation(actionSequence, uiModel.getFeatureName());
//                    test.log(Status.PASS, "Step: " + actionType + " | Locator: " + xpath + " | Value: " + value);
            String extentReportContent = "";
            try {
                extentReportContent = new String(Files.readAllBytes(Paths.get("KafkaTestReport.html")));
            } catch (IOException e) {
                System.err.println("Failed to read Extent Report: " + e.getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    @PostConstruct

//        @KafkaListener(topics = "QATransaction_API_PAYLOAD", groupId = "your-group-id")
//        public void consumeMessage(String message) throws JsonProcessingException {
//
//                scenario = objectMapper.readValue(message, ScenarioMain.class);
//                receivedMessages.add(scenario);
//                setupExtentReports();
//                doHttpCall(scenario);
//
//        }
//
//        private void doHttpCall(ScenarioMain scenario) throws JsonProcessingException {
//            // Creating headers for the HTTP request
//            HttpHeaders headers = new HttpHeaders();
//            ResponseEntity<String> response = null;
//            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
//            if (header != null) {
//                header.forEach(headers::set);
//            }
//            HttpMethod method;
//            for (DataList dataList : scenario.getData_list()) {
//                method= HttpMethod.valueOf(dataList.getMapping_type());
//                featureName = dataList.getScenario().getName();
//                operationType = dataList.getMapping_type();
//                header = dataList.getHeader();
//                test = extent.createTest("Feature: " + featureName)
//                        .assignCategory("API Testing")
//                        .assignAuthor("Automation Team");
//                for (DataSet dataset : dataList.getScenario().getDatasets()) {
//                    Map<String, Object> requestBody = dataset.getRequest_body() != null
//                            ? dataset.getRequest_body()
//                            : new HashMap<>();
//                    HttpEntity<Map<String, Object>> entity = new HttpEntity<>(requestBody, headers);
//
//                    String expectedStatus = dataset.getDesired_status() != null ? dataset.getDesired_status() : "";
//                    String expectedResponse = dataset.getDesired_outcome() != null ? dataset.getDesired_outcome() : "{}";
//                    String endpoint = dataList.getBase_url()+dataList.getEndPoint();
//                    // Converting actual and expected responses to Maps for easy comparison
//                    ObjectMapper objectMapper = new ObjectMapper();
//                    test.info(endpoint);
//                    test.info(String.valueOf(method));
//
////                    Map<String, Object> expectedResponseMap = objectMapper.readValue(expectedResponse, Map.class);
////                    String expectedResponseBody = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(expectedResponse);
////                   String finalExpectedResponse =  objectMapper.writeValueAsString(expectedResponseBody);
//
//                    try {
//                        response = restTemplate.exchange(endpoint, method, entity, String.class);
//                        String actualResponse = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(response.getBody());
////
////                        Map<String, Object> actualResponseMap = objectMapper.convertValue(response.getBody(), Map.class);
//
////                        if (response.getStatusCodeValue() == Integer.parseInt(dataset.getDesired_status()) &&
////                                actualResponse.equals(expectedResponse)) {
//                            if (response.getStatusCodeValue() == Integer.parseInt(dataset.getDesired_status())) {
//                            test.pass("✅ Status Matched: " + expectedStatus);
//                        } else {
//                            test.fail("⚠️ Unexpected Status: Expected " + dataset.getDesired_status() + " but got " + response.getStatusCodeValue());
////                            test.fail("Unexpected Status: Expected Response Body " + dataset.getDesired_status() + " but got " + response.getBody());
//                        }
//
//                    } catch (Exception e) {
//                        // Log the failure and continue with the next dataset
//                        test.fail("❌ API call failed for " + dataset.getRequest_body() + ": " + e.getMessage());
//                    }
//                }
//    }
//            extent.flush();
//
//
//            try {
//                String htmlContent = new String(Files.readAllBytes(Paths.get("APIReport.html")), StandardCharsets.UTF_8);
//                scenario.setReport(htmlContent);
//            } catch (IOException e) {
//                System.err.println("Failed to read Extent Report: " + e.getMessage());
//            }
//
//         String finalMessage=  objectMapper.writeValueAsString(scenario);
//
//                String responseTopic = "QATransaction_API_REPORT";
//                kafkaTemplate.send(responseTopic, finalMessage);
//                System.out.println("Published response to Kafka topic: " + responseTopic);
//
//            File file = new File("APIReport.html");
//            file.delete();
//        }


    private static void setupExtentReports() {
        ExtentHtmlReporter  htmlReporter = new ExtentHtmlReporter(new File("APIReport.html"));
        htmlReporter.config().setDocumentTitle("UI Test Report");
        htmlReporter.config().setReportName("UI Message Processing");
        htmlReporter.config().setTheme(Theme.STANDARD);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Environment", "Local");
        extent.setSystemInfo("Tester", "Automation Team");
    }

}
