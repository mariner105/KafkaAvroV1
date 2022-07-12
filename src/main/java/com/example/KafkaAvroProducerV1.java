package com.example;

import io.confluent.kafka.serializers.KafkaAvroSerializer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.codehaus.jackson.map.ser.std.StringSerializer;

import java.util.Properties;

public class KafkaAvroProducerV1 {

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "127.0.0.1:9092");
        properties.setProperty("acks", "1");
        properties.setProperty("retries", "10");
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer", KafkaAvroSerializer.class.getName());
        properties.setProperty("schema.registry.url", "http://127.0.0.1:8081");

//        KafkaProducer<String, Customer> kafkaProducer = new KafkaProducer<String, Customer>(properties);
//        String topic = "customer-avro";
//
//        Customer customer = ???;
//
//        ProducerRecord<String, Customer> producerRecord = new ProducerRecord<String, Customer>(
//                topic, customer
//        );


    }
}
