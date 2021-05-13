package com.rahul.springboot.FirstProject.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
// @Entity annotation specifies that class is an entity and is mapped to a table in db.
// an entity is a light weight persistence domain object. TYypically an entity represents a table in relational
// database, and each entity instance corresponds to a row in that table.

// An entity is an object that represents something that has an identity that the system is interested in tracking.
// Typical examples are Customers and Accounts.
// Generally you can tell the difference between entities and value objects because entities have a recognizable
// identity, and the system is concerned with creating them, storing them, and changing them.
// In cases where objects map to some database, entities have primary keys that are either
// some kind of composite natural key or an artificial key, while value objects are compared by value.
public class Alien {

    @Id
    // Id annotation specifies the primary key of an entity.
    private int aid;
    private String aname;
    private String tech;

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech(){
        return this.tech;
    }

    public void setTech(String tech){
        this.tech = tech;
    }
}
