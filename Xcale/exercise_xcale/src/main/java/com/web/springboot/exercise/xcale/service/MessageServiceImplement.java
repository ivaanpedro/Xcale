package com.web.springboot.exercise.xcale.service;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.springboot.exercise.xcale.dao.IMessageDao;
import com.web.springboot.exercise.xcale.dto.InputMessageDTO;
import com.web.springboot.exercise.xcale.entity.Chat;
import com.web.springboot.exercise.xcale.entity.Message;
import com.web.springboot.exercise.xcale.entity.Person;

/**
 * 
 * @author ivanpedro1992@gmail.com
 *
 */
@Service
public class MessageServiceImplement implements IMessageService {

	@Autowired
	IMessageDao messageDao;

	@Autowired
	IChatService chatService;
	
	@Autowired
	IPersonService personService;
	
	@Override
	public List<Message> findAll() {
		return (List<Message>) messageDao.findAll();
	}

	@Override
	public List<Message> findMessageByChat(Long idChat) {
		return messageDao.findMessageByChat(idChat);
	}

	@Override
	public void save(Message m) {
		messageDao.save(m);
		
	}

	@Override
	public long send(Long idChat, Long idPerson, @NotNull InputMessageDTO input) {
		Chat chat = chatService.findById(idChat);
		Person person = personService.findById(idPerson);
		Long result = personService.sendMessage(person, chat, input);
		Message m = new Message();
		m.setId_message(input.getId_message());
		m.setSendDate(input.getSendDate());
		m.setText(input.getText());
		m.setChat(chat);
		messageDao.save(m);
		return result;
		
	}

}
