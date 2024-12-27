package com.kafka.producer.producer.service;

import com.kafka.producer.producer.config.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public boolean updateLocation(String location){

        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
        return true;
    }
}

