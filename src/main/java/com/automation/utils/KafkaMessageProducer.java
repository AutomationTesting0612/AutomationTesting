//package com.automation.utils;
//
//import com.automation.utils.ui.model.ActionDetail;
//import com.automation.utils.ui.model.UIModel;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.Producer;
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.kafka.clients.producer.ProducerRecord;
//
//import java.util.*;
//
//public class KafkaMessageProducer {
//
//    private static final String TOPIC = "ui-actions";
//
//    public static void main(String[] args) throws Exception {
//        ObjectMapper objectMapper = new ObjectMapper();
//        try {
//            List<ActionDetail> actions = Arrays.asList(
//                    new ActionDetail("browserType", "", "chrome",""),
//                    new ActionDetail("open", "", "https://valueresearchdev:F@wke$@stagingvro.valueresearchonline.com//login/?utm_source=nav-register&utm_medium=vro-login-sign-modal&utm_campaign=vro#password-login-field",""),
//                    new ActionDetail("text", "//input[@id='username']", "ranjesh",""),
//                    new ActionDetail("click", "//button[@id='proceed-btn']", "",""),
//                    new ActionDetail("text", "//input[@id='login_password']", "ranjesh",""),
//                    new ActionDetail("click", "//button[@id='login-btn']", "",""),
//                    new ActionDetail("validateTitle", "", "",""),
//                    new ActionDetail("click", "//a[@id='navbarDropdown-my-investment']", "","")
//            );
//
////            UIModel uiModel = new UIModel("Login Feature", browser, actions);
//
//            String message = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(uiModel);
//            KafkaProducer<String, String> producer = new KafkaProducer<>(getKafkaProps());
//            producer.send(new ProducerRecord<>(TOPIC, message));
//            producer.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        // Convert to JSON
////        ObjectMapper objectMapper = new ObjectMapper();
////        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonMap);
////
////        System.out.println(jsonString);
////
////        // Kafka Producer (Ensure it's properly initialized)
////        KafkaProducer<String, String> producer = new KafkaProducer<>(getKafkaProps());
////        producer.send(new ProducerRecord<>(TOPIC, jsonString));
////        producer.close();
//    }
//
//    private static Properties getKafkaProps() {
//        Properties props = new Properties();
//        props.put("bootstrap.servers", "localhost:9092");
//        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//        return props;
//    }
//}