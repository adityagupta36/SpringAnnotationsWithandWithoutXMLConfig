package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {

        ApplicationContext context = new
                AnnotationConfigApplicationContext(ConfigurationClass.class);

        College college = (College) context.getBean("college");

//        College college = (College) context.getBean("college");

        System.out.println("College Object is Created : " + college.getClass().getName()  + " <==> and College Name Is: "  +  college.collegeName);

        college.test();




    }
}
