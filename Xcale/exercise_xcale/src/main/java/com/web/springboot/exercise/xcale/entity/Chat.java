package com.web.springboot.exercise.xcale.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.web.springboot.exercise.xcale.dto.InputMessageDTO;


/**
 * 
 * @author ivanpedro1992@gmail.com
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="chat_type", 
discriminatorType = DiscriminatorType.INTEGER)
public abstract class Chat{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_chat", nullable = false)
	private Long idChat;
	@Column(name="nickname", length=70, nullable = false)
	private String nickname;

	public Long getIdChat() {
		return idChat;
	}

	public String getNickname() {
		return nickname;
	}


	public void setIdChat(Long idChat) {
		this.idChat = idChat;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public abstract void sendMessage(InputMessageDTO messsage);

}
