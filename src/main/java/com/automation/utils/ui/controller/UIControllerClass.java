//package com.automation.utils.ui.controller;
//
//
//import com.automation.model.ScenarioMain;
//import com.automation.utils.ui.DataSetService;
//import com.automation.utils.ui.model.UIModel;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.ProducerRecord;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Properties;
//
//@RestController
//public class UIControllerClass {
//
////    private final DynamicWebAutomation automationService;
//
////    @Autowired
////    private DataSetService dataSetService;
//    private final KafkaTemplate<String, String> kafkaTemplate;
//
//    private final ObjectMapper objectMapper = new ObjectMapper();
//
//    public UIControllerClass(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
////        this.automationService = new DynamicWebAutomation(browser); // Defaulting to Chrome
//    }
//
//
//    @PostMapping("create")
//    public void save(@RequestBody UIModel uiModel) {
//        try {
//            String message = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(uiModel);
//            KafkaProducer<String, String> producer = new KafkaProducer<>(getKafkaProps());
//            producer.send(new ProducerRecord<>("ui-actions", message));
//            producer.close();
//            ResponseEntity.ok("Automation executed successfully!");
//        } catch (Exception e) {
//            ResponseEntity.status(500).body("Automation failed: " + e.getMessage());
//        }
//    }
//
//    @PostMapping("api")
//    public ResponseEntity<ScenarioMain> save(@RequestBody ScenarioMain scenarioMain) {
//        try {
//            String message = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(scenarioMain);
//            KafkaProducer<String, String> producer = new KafkaProducer<>(getKafkaProps());
//            producer.send(new ProducerRecord<>("api-actions", message));
//            producer.close();
//            ResponseEntity.ok("Automation executed successfully!");
//            return ResponseEntity.ok().body(scenarioMain);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//                    .body(null);
//        }
//    }
//
//
////    @PostMapping("api/requestBody")
////    public ResponseEntity<com.automation.model.RequestBody> saveRequestBody(@RequestBody com.automation.model.RequestBody requestBody,
////                                                                            HttpServletRequest request) {
////        try {
////            // Log Raw Request
////            String rawJson = new String(request.getInputStream().readAllBytes());
////            System.out.println("Raw Request JSON: " + rawJson);
////
////            if (requestBody == null) {
////                System.out.println("Received DataSet is NULL!");
////                return ResponseEntity.badRequest().build();
////            }
////            dataSetService.saveMethod(requestBody);
////
////            System.out.println("Received DataSet: " + requestBody);
////
////            return ResponseEntity.ok().body(requestBody);
////        } catch (Exception e) {
////            e.printStackTrace();
////            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
////        }
////    }
//
////    @GetMapping("api/get")
////    public ResponseEntity<String> getRequestBody(String name) {
////        try {
////            // Log Raw Request
////
////           String namereport =dataSetService.getMethod(name);
////
//////            System.out.println("Received DataSet: " + requestBody);
////
////            return ResponseEntity.ok().body(namereport);
////        } catch (Exception e) {
////            e.printStackTrace();
////            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
////        }
////    }
//
//    private static Properties getKafkaProps() {
//        Properties props = new Properties();
//        props.put("bootstrap.servers", "localhost:9092");
//        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        return props;
//    }
//}
