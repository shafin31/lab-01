package com.example.petshaw;

import java.util.Date;
public abstract class Pet {
    private String name;
    private Date birthDate;

    public Pet(String name){
        this.name = name;
        this.birthDate = new Date();

    }

    public String getName() {
        return name;
    }
    public abstract String speak();


    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Pet(String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }




}
