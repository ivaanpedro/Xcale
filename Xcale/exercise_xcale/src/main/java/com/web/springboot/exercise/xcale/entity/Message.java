package com.web.springboot.exercise.xcale.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * 
 * @author ivanpedro1992@gmail.com
 *
 */
@Entity
@Table(name="message")
public class Message implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_message", nullable = false)
	private Long idMessage;
	
	@Lob
	@Column(name="text", nullable = false)
	private String text;
	
	@Column(name="send_date")
	private Date sendDate;
	
	@ManyToOne
	private Chat chat;

	public Long getId_message() {
		return idMessage;
	}

	public String getText() {
		return text;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setId_message(Long id_message) {
		this.idMessage = id_message;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public Long getIdMessage() {
		return idMessage;
	}

	public Chat getChat() {
		return chat;
	}

	public void setIdMessage(Long idMessage) {
		this.idMessage = idMessage;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	
	
}
