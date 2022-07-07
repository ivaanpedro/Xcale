package com.web.springboot.exercise.xcale.controller;

import java.util.Map;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.web.springboot.exercise.xcale.dto.InputMessageDTO;
import com.web.springboot.exercise.xcale.service.IMessageService;

/**
 * 
 * @author ivanpedro1992@gmail.com
 *
 */
@Controller
public class PersonController {
	
	@Autowired
	IMessageService messageService;

	
	/**
	 * Endpoint para enviar un mensaje a un chat específico
	 * @param idChat
	 * @param idPerson
	 * @param input
	 * @param model
	 * @return
	 *
	 */
	@PostMapping("/sendMessage/{idChat}/{idPerson}") 
	public ResponseEntity<Long> sendMessage(@PathVariable Long idChat,
			@PathVariable Long idPerson,
			@NotNull @RequestBody InputMessageDTO input, Map<String, Object> model) {
		
		Long result = messageService.send(idChat, idPerson, input);
		return ResponseEntity.ok(result);
	}
}
