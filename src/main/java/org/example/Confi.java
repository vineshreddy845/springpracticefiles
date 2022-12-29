package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Confi {

   //@Qualifier("same")
    @Autowired
    Beanannotation b1;
    @Autowired
    beanalias bore;
    @Value("1")
    int number;
    @Value("nope")
    String name;
    @Value("noon")
    String surname;

   /* public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }*/



  /*  public void setB1(Beanannotation b1)
    {
        this.b1=b1;
    }
    public Beanannotation getB1()
    {
        return b1;
    }*/
    public void namste()
    {
        System.out.println("hello");
        b1.hello();
        System.out.println("number = "+ number+"name = "+name);
        bore.hhh();
        System.out.println(bore);
    }
}
