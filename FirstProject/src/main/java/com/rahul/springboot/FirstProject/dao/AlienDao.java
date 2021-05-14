package com.rahul.springboot.FirstProject.dao;

import com.rahul.springboot.FirstProject.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

// SpringData JPA
// change CrudRepository to JpaRepository
// JpaRepository gives List whereas Crud gives iterable.
public interface AlienDao extends JpaRepository<Alien, Integer> {
    // find all the aliens in tech domain
    // NOTE: all method names should start by findBy and end with name of property.

    List <Alien> findByTech(String tech);
    List <Alien> findByAidGreaterThan(int aid);

    // write your own query
    // findby tech by all the values should be sorted by names
    // note this is jql, not exactly sql
    @Query("from Alien where tech=?1 order by aname")
    List <Alien> findByTechSorted(String tech);
}
