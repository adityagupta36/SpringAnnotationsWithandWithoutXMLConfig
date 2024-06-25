package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class ScienceTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("Hi iam ur Science Teacher");
        System.out.println("Hi my name is Adityaaa Guptaaa");
    }
}
