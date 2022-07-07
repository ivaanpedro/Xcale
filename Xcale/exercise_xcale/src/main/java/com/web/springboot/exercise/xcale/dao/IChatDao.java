package com.web.springboot.exercise.xcale.dao;

import org.springframework.data.repository.CrudRepository;

import com.web.springboot.exercise.xcale.entity.Chat;


/**
 * 
 * @author ivanpedro1992@gmail.com
 *
 */
public interface IChatDao extends CrudRepository<Chat, Long>{

}
