package com.kafka.producer.producer.controller;

import com.kafka.producer.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("location")
public class LocationController {

    @Autowired
    private ProducerService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){

//        for(int i=0; i<100000; i++){
//            this.kafkaService.updateLocation("(" + Math.round(Math.random()*100) + "," + Math.round(Math.random()*100) + " " +")");
//        }
        this.kafkaService.updateLocation("(" + Math.round(Math.random()*100) + "," + Math.round(Math.random()*100) + " " +")");
        return new ResponseEntity<>(Map.of("message", "successfully"), HttpStatus.OK);
    }
}
