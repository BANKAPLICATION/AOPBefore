package com.example.aop.aspects;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class LoggingAspect {
// pointcut - eto kogda dolzhen vipolnitsya skvoznoy kod
//    @Before("execution(public void getBook())") the specific approach from method
//    public void beforeGetBookAdvice() {
//        System.out.println("beforeGetBookAdvice: the attempt to get a book");
//    }

    @Before("execution(public void get*())") // the generic like any get method we can catch which starts from get
    public void beforeGetBookAdvice() {
        System.out.println("beforeGetBookAdvice: the attempt to get a book");
    }


//    @Before("execution(public void returnBook())") // the generic like any get method we can catch which starts from get
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: the attempt to return a book");
//    }

    
    //ANY RETURN TYPE AND ANY ACCESS MODIFIER
    @Before("execution( * returnBook())") // the generic like any get method we can catch which starts from get
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: the attempt to return a book");
    }

//    @Before("execution( * *())") // this method will be for all method with any access modifier and name
//    public void alwaysInvoker() {
//        System.out.println("the unknown method is calling");
//    }






}
