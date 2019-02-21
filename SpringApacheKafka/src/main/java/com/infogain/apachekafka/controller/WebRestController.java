package com.infogain.apachekafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infogain.apachekafka.services.KafkaProducer;
import com.infogain.apachekafka.storage.MessageStorage;

@RestController
@RequestMapping(value="/kafka")
public class WebRestController {
	// new meeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee
	@Autowired
	KafkaProducer producer;
	// tetttttttttttttttttttttttttt
	@Autowired
	MessageStorage storage;
	
	@GetMapping(value="/producer")
	public String producer(){
		String data ="our test message"; 
		producer.send(data);
		
		return "Done";
	}
	
	@GetMapping(value="/consumer")
	public String getAllRecievedMessage(){
		String messages = storage.toString();
		storage.clear();
		return messages;
	}
}
