package com.web.springboot.exercise.xcale.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.web.springboot.exercise.xcale.dto.InputMessageDTO;


/**
 * 
 * @author ivanpedro1992@gmail.com
 *
 */
@Entity
@DiscriminatorValue("1")
public class Contact extends Chat{

	@Column(name="number", length=10, nullable = false)
	private String number;
	@Column(name="name", length=50, nullable = false)
	private String name;

	public String getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void sendMessage(InputMessageDTO messsage) {
		//enviar mensaje a contacto (usando API de whatsapp por ejemplo)
		this.notifyContact();
	}

	private void notifyContact() {
		//Notificación de contacto
	}
}
