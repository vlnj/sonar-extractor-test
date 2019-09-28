package com.mkyong.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LNVITHANAGE on 6/27/2017.
 */
public class SingletonFactory {

    private Map<String, Object> cache = new HashMap<>();

    private static SingletonFactory INSTANCE = new SingletonFactory();

    public static SingletonFactory getInstance() {
        return INSTANCE;
    }

    public Map<String, Object> getCache() {
        return cache;
    }

    private SingletonFactory() {
        System.out.println("Initiating ...");
    }
}
