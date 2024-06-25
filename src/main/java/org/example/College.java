package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component   //default bean id==> college
//@Component("collegeBean") //can give specific id to @Component Annotation //creates a bean(object create inside IOC: Application Context)
public class College {

//    @Value("TCET")            //setting value
    @Value("${collegename}")       //gets linked with @PropertySources("application.properties") Annotation in Configuration class
    String collegeName;
    @Autowired
    private Principal principal;

    @Autowired
//    @Qualifier("scienceTeacher")
    @Qualifier
    private Teacher teacher;

//        injecting using setter injection
/*    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }*/


//    injecting using constructor injection
  /*  public College(Principal principal) {
        this.principal = principal;
    }*/

//    injecting using setter injection
/*    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }*/

    public void test(){
        System.out.println("Testing College Class method");
        principal.principalInfo();
        teacher.teach();
        System.out.println(collegeName);
    }

}