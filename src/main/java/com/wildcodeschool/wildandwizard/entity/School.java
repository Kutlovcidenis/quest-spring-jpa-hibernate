package com.wildcodeschool.wildandwizard.entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity                                                                 // which indicates that your object will be managed by Spring Data 
public class School {                                                   // and that its attributes will be converted into columns of DB tables.

    @Id                                                                 // indicates that the attribute should be used as the primary key in the table corresponding to the entity. 
    @GeneratedValue(strategy = GenerationType.IDENTITY)                 // which indicates that the value of the id will be generated automatically, 
    private Long id;                                                    // and incrementally, upon insertion into the database. This annotation can accept various values 
                                                                        // epending on the project requirements.

    private String name;
    private Long capacity;
    private String country;

    public School() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

