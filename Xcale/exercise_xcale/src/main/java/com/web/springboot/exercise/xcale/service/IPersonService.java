package com.web.springboot.exercise.xcale.service;

import com.web.springboot.exercise.xcale.dto.InputMessageDTO;
import com.web.springboot.exercise.xcale.entity.Chat;
import com.web.springboot.exercise.xcale.entity.Person;

/**
 * 
 * @author ivanpedro1992@gmail.com
 *
 */
public interface IPersonService {

	public Person findById(Long personId);
	
	public long sendMessage(Person person, Chat chat, InputMessageDTO message);
}
