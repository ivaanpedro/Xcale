package com.web.springboot.exercise.xcale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.springboot.exercise.xcale.dao.IPersonDao;
import com.web.springboot.exercise.xcale.dto.InputMessageDTO;
import com.web.springboot.exercise.xcale.entity.Chat;
import com.web.springboot.exercise.xcale.entity.Person;

/**
 * 
 * @author ivanpedro1992@gmail.com
 *
 */
@Service
public class PersonServiceImplement implements IPersonService{

	@Autowired
	IPersonDao personDao;	
	
	
	@Override
	public long sendMessage(Person person, Chat chat, InputMessageDTO message) {
		person.sendMessage(chat.getIdChat(), message);
		return 1;
	}

	@Override
	public Person findById(Long personId) {
		return personDao.findById(personId).orElse(null);
	}

}
