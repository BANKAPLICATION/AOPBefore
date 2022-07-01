package com.example.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We are taking a book from UniLibrary");
    }

    public void returnBook() {
        System.out.println("We are returning a book from UniLibrary");
    }


    public void getMagazine() {
        System.out.println("We are getting a magazine from Unilibrary");
    }

    public void returnMagazine() {
        System.out.println("We are returning a magazine to Unilibrary");
    }

    public void addBook() {
        System.out.println("We are adding a book to UniLibrary");
    }

    public void addMagazine() {
        System.out.println("We are adding a magazine to UniLibrary");
    }


}
