package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mains {
    public static void main(String args[])
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Confifile.class);

        Confi boo = context.getBean(Confi.class);
       // Beanannotation boo1 = context.getBean(Beanannotation.class);
        //boo1.hello();
        boo.namste();


    }
}


/*@Bean
// Here the method name is the
// bean id/bean name

public College collegeBean()
{
    // Returns the College object
    return new College();
}

