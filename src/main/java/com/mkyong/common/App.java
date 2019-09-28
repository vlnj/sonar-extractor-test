package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    }
}
