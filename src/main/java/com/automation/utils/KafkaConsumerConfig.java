//package com.automation.utils;
//
//import com.automation.model.DataSet;
//import com.automation.model.ScenarioMain;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.http.*;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//import org.springframework.web.reactive.function.client.WebClient;
//
//import java.util.Map;
//
//@Service
//public class KafkaConsumerConfig {
//
//    private final RestTemplate restTemplate;
//    private final ObjectMapper objectMapper;
//
//
//    public KafkaConsumerConfig(RestTemplate restTemplate, ObjectMapper objectMapper) {
//        this.restTemplate = restTemplate;
//        this.objectMapper = objectMapper;
//    }
//
//    @KafkaListener(topics = "api-actions", groupId = "api-consumer-group")
//    public void consumeMessage(String message) {
//        try {
//            System.out.println("Received message: " + message);
//
//            // Convert JSON string to a JSON Node (dynamic parsing)
//            JsonNode jsonNode = objectMapper.readTree(message);
//
//            // ✅ Check if "dataLists" exists and has at least one element
//            if (!jsonNode.has("dataLists") || jsonNode.get("dataLists").isEmpty()) {
//                System.err.println("Error: 'dataLists' is missing or empty in the JSON.");
//                return;
//            }
//            JsonNode dataList = jsonNode.get("dataLists").get(0);
//
//            // ✅ Check if "endPoint" exists
//            if (!dataList.has("endPoint")) {
//                System.err.println("Error: 'endPoint' is missing in dataLists.");
//                return;
//            }
//            String endpoint = dataList.path("endPoint").asText();
//            System.out.println("Extracted Endpoint: " + endpoint);
//
//            // ✅ Check if "scenarioModel" exists and has at least one element
//            if (!dataList.has("scenarioModel") || dataList.get("scenarioModel").isEmpty()) {
//                System.err.println("Error: 'scenarioModel' is missing or empty.");
//                return;
//            }
//            JsonNode scenarioModel = dataList.get("scenarioModel").get(0);
//
//            // ✅ Check if "dataSet" exists and has at least one element
//            if (!scenarioModel.has("dataSet") || scenarioModel.get("dataSet").isEmpty()) {
//                System.err.println("Error: 'dataSet' is missing or empty.");
//                return;
//            }
//            JsonNode dataSet = scenarioModel.get("dataSet").get(0);
//
//            // ✅ Check if "requestBody" exists
//            if (!dataSet.has("requestBody")) {
//                System.err.println("Error: 'requestBody' is missing in dataSet.");
//                return;
//            }
//            JsonNode requestBodyNode = dataSet.path("requestBody");
//
//            Map<String, Object> requestBody = objectMapper.convertValue(requestBodyNode, Map.class);
//            System.out.println("Extracted RequestBody: " + requestBody);
//
//            // Extract headers
//            JsonNode headerNode = jsonNode.path("dataLists").get(0).path("header");
//            HttpHeaders headers = new HttpHeaders();
//            headers.setContentType(MediaType.APPLICATION_JSON);
//            if (headerNode.has("content-Type")) {
//                headers.set("Content-Type", headerNode.get("content-Type").asText());
//            }
//
//            // Create HttpEntity with extracted requestBody
//            HttpEntity<Map<String, Object>> entity = new HttpEntity<>(requestBody, headers);
//
//            // Send HTTP Request dynamically
//
//            WebClient webClient = WebClient.builder().baseUrl(api).build();
//
//            DataSet response = webClient.post()
//                    .uri("/api/requestBody")
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .bodyValue(dataSet)
//                    .retrieve()
//                    .bodyToMono(DataSet.class)
//                    .block();
//
//            response.getRequestBody();
//
//
//        } catch (Exception e) {
//            System.err.println("Error processing message: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//
//
//
//}
//
//
