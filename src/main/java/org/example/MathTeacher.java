package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary                                           //if multiple beans  are candidates to be autowired to a single-valued dependency
public class MathTeacher  implements Teacher{
    @Override
    public void teach() {
        System.out.println("Hi iam ur math Teacher");
        System.out.println("My name is Adityaa Guptaa");
    }

}
