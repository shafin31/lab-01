package com.example.petshaw;
import java.util.Date;
public class Cat extends Pet implements Pettable{
    public Cat(String name){
        super(name);

    }
    public Cat(String name, Date birthDate) {
        super(name, birthDate); // call parent's constructor
    }

    @Override
    public String speak() {
        return "meow"; // Cats meow
    }

    public Void pet() {
        System.out.println(getName() + " meow");
        return null;
    }
}
