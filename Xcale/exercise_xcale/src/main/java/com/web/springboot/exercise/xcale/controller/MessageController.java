package com.web.springboot.exercise.xcale.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.web.springboot.exercise.xcale.entity.Message;
import com.web.springboot.exercise.xcale.service.IMessageService;

/**
 * 
 * @author ivanpedro1992@gmail.com
 *
 */
@Controller
public class MessageController {

	@Autowired
	IMessageService messageService;
	
	/***
	 * 
	 * @param idChat
	 * @param model
	 * @return
	 */
	//Aclaro que acá habría que usar DTO para no exponer la entidad
	//No lo implemento por cuestiones de tiempo para resolver el ejercicio
	@GetMapping("/findMessagesByChat/{idChat}") 
	public ResponseEntity<List<Message>> findMessagesByChat(@PathVariable Long idChat, Map<String, Object> model) {
		
		List<Message> result = messageService.findMessageByChat(idChat);
		return ResponseEntity.ok(result);
	}
	
	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/findAllMessages") 
	public ResponseEntity<List<Message>> findAllMessages(Map<String, Object> model) {
		
		List<Message> result = messageService.findAll();
		return ResponseEntity.ok(result);
	}
}
