package org.example;

import org.springframework.beans.factory.annotation.Value;

public class family {
    @Value("888")
    int id;
    @Value("backbone")
    String arms;
    public void names()
    {
        System.out.println("rothyhey");
        System.out.println("id = "+id+"arms = "+arms);

    }
}
