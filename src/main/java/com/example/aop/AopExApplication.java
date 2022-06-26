package com.example.aop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AopExApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary",
                UniLibrary.class);
//        uniLibrary.getBook();
        uniLibrary.returnBook();
//        uniLibrary.getMagazine();



        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary",
                SchoolLibrary.class);
//        schoolLibrary.getBook();


        context.close();

//        SpringApplication.run(AopExApplication.class, args);
    }

}
