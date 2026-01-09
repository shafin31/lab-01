package com.example.petshaw;
import java.util.Date;
public class Dog extends Pet implements Pettable {
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, Date birthDate) {
        super(name, birthDate);
    }

    public String speak() {
        return "bark";
    }
    public Void pet() {
        System.out.println(getName() + "bark");
        return null;
    }
}
