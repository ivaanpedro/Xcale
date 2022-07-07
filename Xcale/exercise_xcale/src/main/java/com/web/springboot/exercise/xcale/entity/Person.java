package com.web.springboot.exercise.xcale.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.web.springboot.exercise.xcale.dto.InputMessageDTO;

/**
 * 
 * @author ivanpedro1992@gmail.com
 *
 */
@Entity
@Table(name="person")
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_person", nullable = false)
	private Long idPerson;
	@Column(name="dni", length=8, nullable = false)
	private String dni;
	@Column(name="name", length=50, nullable = false)
	private String name;
	
	//Carga en forma "perezosa", es decir, cuando se necesitan
	@OneToMany(fetch=FetchType.LAZY)
	private Set<Chat> chats;

	public Long getIdPerson() {
		return idPerson;
	}

	public String getDni() {
		return dni;
	}

	public String getName() {
		return name;
	}

	public Set<Chat> getChats() {
		return chats;
	}

	public void setIdPerson(Long idPerson) {
		this.idPerson = idPerson;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setChats(Set<Chat> chats) {
		this.chats = chats;
	}
	
	public long sendMessage(Long chatId, InputMessageDTO message) {
		for (Chat c: chats) {
			if(c.getIdChat().equals(chatId)) {
				c.sendMessage(message);
				return 1;
			}
		}
		return 0;
	}
	
}
