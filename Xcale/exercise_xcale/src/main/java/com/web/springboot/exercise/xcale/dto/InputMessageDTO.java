package com.web.springboot.exercise.xcale.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


/**
 * 
 * @author ivanpedro1992@gmail.com
 * 
 */
public class InputMessageDTO implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	private Long id_message;
	@Lob
	@NotBlank
	private String text;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date send_date;

	public Long getId_message() {
		return id_message;
	}

	public String getText() {
		return text;
	}

	public Date getSendDate() {
		return send_date;
	}

	public void setId_message(Long id_message) {
		this.id_message = id_message;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setSendDate(Date sendDate) {
		this.send_date = sendDate;
	}
	
	
}
