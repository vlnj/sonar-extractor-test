package com.mkyong.common;

/**
 * Hello world!
 */
public class HelloWorld {
    private static String name = "Lasitha";
    public String message;

    public void printHello() {
        System.out.println("Hello ! " + name);
    }

    private String getName() {
        return name;
    }

    private int getAge(){
        return 0;
    }

    public String getMessage(){
        return "";
    }


}
