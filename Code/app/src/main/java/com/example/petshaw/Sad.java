package com.example.petshaw;

import java.util.Date;

public class Sad extends Mood {
    public Sad(){
        super();
    }

    public Sad(Date date){
        super(date);
    }


    public String represent() {
        return "Sad";
    }
}
