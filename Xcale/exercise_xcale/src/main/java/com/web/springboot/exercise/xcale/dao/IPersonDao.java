package com.web.springboot.exercise.xcale.dao;

import org.springframework.data.repository.CrudRepository;

import com.web.springboot.exercise.xcale.entity.Person;


/**
 * 
 * @author ivanpedro1992@gmail.com
 *
 */
public interface IPersonDao extends CrudRepository<Person, Long>{

}
