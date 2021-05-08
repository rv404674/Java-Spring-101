package com.rahul.springboot.FirstProject.dao;

import com.rahul.springboot.FirstProject.model.Alien;
import org.springframework.data.repository.CrudRepository;

public interface AlienDao extends CrudRepository<Alien, Integer> {
}
