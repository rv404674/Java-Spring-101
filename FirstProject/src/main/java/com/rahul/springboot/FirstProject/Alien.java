package com.rahul.springboot.FirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
// NOTE: component makes Alien class a part of spring framework and put it in the spring container.
public class Alien {

    private int id;
    private String name;

    // Alien class is dependent on Laptop class
    // Alien class is dependent on Laptop class. Both of them are in spring container.
    // but we need a way through which alien can connect/search for laptop class. i.e Autowired.
    // Autowired will try to search the object in spring container.
    // to search by name we can use
    // @Qualifier("lap1")
    @Autowired
    private Laptop laptop;

    public Alien(){
        System.out.println("Object Created");
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void show(){
        System.out.println("SHOW...");
        laptop.compile();
    }
}
