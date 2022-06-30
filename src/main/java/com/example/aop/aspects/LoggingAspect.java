package com.example.aop.aspects;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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

    @Before("execution(public void getBook(String))") // matches with String parameter
    public void beforeTest() {
        System.out.println("test");
    }

    @Before("execution(public void *(*))") // matches with only one parameter
    public void test2() {
        System.out.println("test");
    }


    @Before("execution(public void *(..))") // matches with any two parameter
    public void test3() {
        System.out.println("test");
    }


//    @Before("execution(public void *(com.example.Book, ..))") // matches with any two parameter
//    public void test4() {
//        System.out.println("test");
//    }

    @Pointcut("execution(* get*())")
    private void allGetMethods() {
    }

    @Before("allGetMethods()") // We just use one and it works
    public void test4() {
        System.out.println("test");
    }

    @Before("allGetMethods()") // We just use one and it works
    public void test5() {
        System.out.println("test");
    }


}
