package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.stream.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        HelloWorld obj = (HelloWorld) context.getBean("abcd");
        System.out.println();


        System.out.println("abc");
        System.out.println("abc");
        System.out.println("abc");

        try {
            OutputStream os = new FileOutputStream("/file");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}