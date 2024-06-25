package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration                      //Avoids XML Configuration
@ComponentScan("org.example")
@PropertySource("application.properties")
public class ConfigurationClass {

/*    @Bean
    public Teacher mathTeacher(){
        return new MathTeacher();

    }


    @Bean
    public Teacher scienceTeacher(){
        return new ScienceTeacher();

    }


    @Bean
    public Principal principalBean(){
        return new Principal();
    }

    @Bean("clgBean")                                  //Using Bean approach : creates a bean(object create inside IOC: Application Context)
    public College collegeBean(){
        College college = new College();
//        return new College(principalBean());
//        return new College(principalBean());       //injecting using constructor injection
        college.setPrincipal(principalBean());       //injecting using setter injection
        college.setTeacher(scienceTeacher());           //injecting using setter injection
        return college;
    }*/



}
