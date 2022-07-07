package com.web.springboot.exercise.xcale.service;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.web.springboot.exercise.xcale.dto.InputMessageDTO;
import com.web.springboot.exercise.xcale.entity.Message;


/**
 * 
 * @author ivanpedro1992@gmail.com
 *
 */
public interface IMessageService {

	public List<Message> findAll();
	
	public List<Message> findMessageByChat(Long idChat);

	public void save(Message m);

	public long send(Long idChat, Long idPerson, @NotNull InputMessageDTO input);
}
