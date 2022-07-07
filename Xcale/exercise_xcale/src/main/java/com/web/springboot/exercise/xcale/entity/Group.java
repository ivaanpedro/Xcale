package com.web.springboot.exercise.xcale.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

import com.web.springboot.exercise.xcale.dto.InputMessageDTO;

/**
 * 
 * @author ivanpedro1992@gmail.com
 *
 */
@Entity
@DiscriminatorValue("2")
public class Group extends Chat{
	
	//Carga en forma "perezosa", es decir, cuando se necesitan
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Contact> contacts;

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public void sendMessage(InputMessageDTO messsage) {
		for (Contact c: contacts) {
			c.sendMessage(messsage);
			this.notifyGroup();
		}
	}
	
	private void notifyGroup() {
		//Notificación de grupo
	}
	
}
