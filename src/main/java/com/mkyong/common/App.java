package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.stream.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws FileNotFoundException {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        HelloWorld obj = (HelloWorld) context.getBean("abcd");
        System.out.println();


        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");

        try (OutputStream os = new FileOutputStream("/file")) {
        } catch (IOException e) {
            e.printStackTrace();
        }
       
        OutputStream os3 = new FileOutputStream("/file");

    }

    private void a(){}
}
