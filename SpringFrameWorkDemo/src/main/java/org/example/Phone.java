package org.example;

import org.springframework.stereotype.Component;

@Component
public class Phone {
    private String mob = "770-000-0000";

    @Override
    public String toString(){
        return mob;
    }




    }
