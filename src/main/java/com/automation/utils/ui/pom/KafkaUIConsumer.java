package com.automation.utils.ui.pom;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.List;
import java.util.Map;

public class KafkaUIConsumer {

    private final ObjectMapper objectMapper = new ObjectMapper();

//    @KafkaListener(topics = "ui-actions", groupId = "ui-automation-group")
    public void consumeMessage(String message) {
        try {
            List<Map<String, String>> actionSequence = objectMapper.readValue(message, List.class);

            // Run automation dynamically
//            DynamicWebAutomation automation = new DynamicWebAutomation();
//            automation.executeAutomation(actionSequence, "Test");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
