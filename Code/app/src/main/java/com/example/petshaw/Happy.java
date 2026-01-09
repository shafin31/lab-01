package com.example.petshaw;

import java.util.Date;

public class Happy extends Mood{
    public Happy(){
        super();
    }

    public Happy(Date date){
        super(date);
    }


    public String represent() {
        return "Happy";
    }
}
