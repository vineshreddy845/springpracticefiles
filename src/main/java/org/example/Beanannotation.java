package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Beanannotation {
    @Autowired
    family fam;
    public void hello()
    {
        System.out.println("Hi nature");
        fam.names();


    }

}
