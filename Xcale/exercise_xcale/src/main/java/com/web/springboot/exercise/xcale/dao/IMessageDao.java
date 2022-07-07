package com.web.springboot.exercise.xcale.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.web.springboot.exercise.xcale.entity.Message;

/**
 * 
 * @author ivanpedro1992@gmail.com
 *
 */
public interface IMessageDao extends CrudRepository<Message, Long>{

	@Query(value = "SELECT * FROM message WHERE chat_id_chat = ?1 order by send_date desc ",
		    nativeQuery = true)
	public List<Message> findMessageByChat(Long idChat);
}
