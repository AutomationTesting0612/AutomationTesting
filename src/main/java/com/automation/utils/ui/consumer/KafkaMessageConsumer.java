//package com.automation.utils.ui.consumer;
//
//import com.automation.def.CucumberHooks;
//import com.automation.def.LoginDOPStepDef;
//import com.automation.model.ScenarioModel;
//import com.automation.utils.ui.pom.EnterURLDOPStepDef;
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpMethod;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.client.RestTemplate;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class KafkaMessageConsumer {
//
//    private final List<ScenarioModel> receivedMessages = new ArrayList<>();
//    private final ObjectMapper objectMapper = new ObjectMapper();
//
//    private final RestTemplate restTemplate = new RestTemplate();
//
//    private KafkaTemplate<String, String> kafkaTemplate;
//
//    ScenarioModel scenario;
//
//
//    private static ExtentReports extent;
//    private static ExtentTest test;
//
//    @KafkaListener(topics = "ui-topic", groupId = "your-group-id")
//    public void consumeMessage(String message) {
//        try {
//            scenario = objectMapper.readValue(message, ScenarioModel.class);
//            receivedMessages.add(scenario);
//            setupExtentReports();
//            test = extent.createTest("Feature: " + scenario.getScenario().getName())
//                    .assignCategory("Kafka API Testing")
//                    .assignAuthor("Automation Team");
//
//
//            // Invoke HTTP operation
//            String operation = scenario.getMapping_type(); // e.g., "POST", "GET"
//            doHttpCall(operation, scenario);
//
//            System.out.println("Received and stored: " + scenario);
//        } catch (Throwable e) {
//            System.err.println("Error processing message: " + e.getMessage());
//        }
//    }
//
//    public List<ScenarioModel> getReceivedMessages() {
//        return receivedMessages;
//    }
//
//    private void doHttpCall(String operation, ScenarioModel model) throws Throwable {
//        String requestUri = model.getBase_url() + model.getEndpoint();
//        String ui_url = model.getUri_url();
//        System.out.println("Calling API: " + requestUri);
//
//        // Extract headers
//        HttpHeaders headers = new HttpHeaders();
//        if (model.getHeader() != null) {
//            model.getHeader().forEach(headers::set);
//        }
//
//        // Extract request body from dataset (first dataset used)
//        Map<String, String> requestBody = new HashMap<>();
//        if (model.getScenario() != null && model.getScenario().getDatasets() != null
//                && !model.getScenario().getDatasets().isEmpty()) {
//            requestBody = model.getScenario().getDatasets().get(0).getRequest_body();
//        }
//
//        // Prepare request entity
//        HttpEntity<Map<String, String>> entity = new HttpEntity<>(requestBody, headers);
//
//        // Determine HTTP method
//        HttpMethod method = HttpMethod.valueOf(operation.toUpperCase());
//
//        if (method == null) {
//            throw new IllegalArgumentException("Invalid HTTP method: " + operation);
//        }
//
//        // Send request and return response
////        ResponseEntity<String> response = restTemplate.exchange(requestUri, method, entity, String.class);
//        // Debugging
////        System.out.println("HTTP Response Status: " + response.getStatusCode());
////        System.out.println("HTTP Response Body: " + response.getBody());
////
////        test.info("Feature Name: " + scenario.getScenario().getName());
////        test.info("Mapping Type: " + scenario.getMapping_type());
////        test.info("status: " + response.getStatusCode());
////        test.info("body: " + response.getBody());
//
//
//        extent.flush();
//
//        CucumberHooks hooks = new CucumberHooks();
//        EnterURLDOPStepDef enterURLDOPStepDef = new EnterURLDOPStepDef();
//        LoginDOPStepDef loginPage = new LoginDOPStepDef();
//
//        hooks.init();
//        enterURLDOPStepDef.enterTheUsernameAndAndClickOnSubmitButton(ui_url);
////        loginPage.enterTheUsernameAndAndClickOnSubmitButton(message,message, ui_url);
//
////        scenario=  scenario.setReport(test);
//
//        String extentReportContent = "";
//        try {
//            extentReportContent = new String(Files.readAllBytes(Paths.get("KafkaTestReport.html")));
//        } catch (IOException e) {
//            System.err.println("Failed to read Extent Report: " + e.getMessage());
//        }
//
////        CombinedResponse combinedResponse = new CombinedResponse(response, extentReportContent);
//
////        String message = objectMapper.writeValueAsString(combinedResponse);
//
//        // Ensure we don't send null messages to Kafka
////        if (message != null) {
////            String responseTopic = "Response-topic";
////            kafkaTemplate.send(responseTopic, message);
////            System.out.println("Published response to Kafka topic: " + responseTopic);
////        } else {
////            System.err.println("Response body is null or empty, not publishing to Kafka.");
////        }
//
////        test.info("Received Message from Kafka:");
//
//
////        return response;
//    }
//
//
//
//    private static void setupExtentReports() {
//
//        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(new File("C:\\Users\\pc\\IdeaProjects\\AutomationTesting\\KafkaTestReport.html"));
//        htmlReporter.config().setDocumentTitle("Kafka API Test Report");
//        htmlReporter.config().setReportName("Kafka Message Processing");
//        htmlReporter.config().setTheme(Theme.STANDARD);
//
//        extent = new ExtentReports();
//        extent.attachReporter(htmlReporter);
//        extent.setSystemInfo("Environment", "Local");
//        extent.setSystemInfo("Tester", "Automation Team");
//
//    }
//
//}
