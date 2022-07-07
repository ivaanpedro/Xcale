package com.web.springboot.exercise.xcale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.springboot.exercise.xcale.dao.IChatDao;
import com.web.springboot.exercise.xcale.entity.Chat;

/**
 * 
 * @author ivanpedro1992@gmail.com
 *
 */
@Service
public class ChatServiceImplement implements IChatService{

	@Autowired
	IChatDao chatDao;
	
	@Override
	public Chat findById(Long idChat) {
		return chatDao.findById(idChat).orElse(null);
	}

}
