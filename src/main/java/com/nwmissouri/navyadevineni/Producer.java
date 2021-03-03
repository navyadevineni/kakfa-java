package com.nwmissouri.navyadevineni;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class Producer {
    public static void main(String[] args) throws Exception {

        String topicName = "producerconsumer-message";
        String key = "Key";
        String value = "Value";

        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);

        for (int i = 0; i <= 10; i++) {

            ProducerRecord<String, String> record = new ProducerRecord<String, String>(topicName, key + i, value + i);
            // asynchronous send without callback.
            producer.send(record);
        }

        producer.close();

        System.out.println("SimpleProducer Completed.");
    }
}
