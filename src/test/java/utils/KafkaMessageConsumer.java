package utils;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import step.def.CucumberHooks;
import step.def.LoginDOPStepDef;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;


public class KafkaMessageConsumer {
    private static final String TOPIC = "login";
    private static final String BOOTSTRAP_SERVERS = "localhost:9092";
    private static final String GROUP_ID = "test-group";

    public static String consumeMessage() throws Throwable {
        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, GROUP_ID);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
        consumer.subscribe(Collections.singletonList(TOPIC));

        CucumberHooks hooks = new CucumberHooks();
        LoginDOPStepDef loginPage = new LoginDOPStepDef();

        String message = null;

            ConsumerRecords<String, String> records = consumer.poll(Duration.ofDays(1));
            for (ConsumerRecord<String, String> record : records) {
                message = record.value();
//                DynamicTestExecutor.runTestWithKafkaMessage(message);
                hooks.init();
                loginPage.enterTheUsernameAndAndClickOnSubmitButton(message,message);
                System.out.println("Received message: " + message);
                break; // Process only the first message
            }

        return message;
    }

}

