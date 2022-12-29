package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   // These is configuration file. before we use confi file has xml.now we use @Configuration annotation.
public class Confifile {
    @Bean(name = "name1")  //  before we use <bean></bean> tag in xml. now we use @bean annotation.
    public Confi calling() // creating object  syntax: public class_name method_name(){ return new class_name;
    {                                                                   // method name is bean id/bean name.
        return new Confi(); // returning object. Confi con = new Confi();
    }

    @Bean
    public Beanannotation same()
    {
        return new Beanannotation(); //
    }
    @Bean(name = "some")
    public family some()
    {
        return new family();
    }
    @Bean
    public beanalias alias()
    {
        return new beanalias();
    }
}
