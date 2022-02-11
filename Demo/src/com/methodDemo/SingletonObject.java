package com.methodDemo;

public class SingletonObject {

    private SingletonObject(){}
    private static SingletonObject object;
    public static SingletonObject getInstance(){
        return  object== null? new SingletonObject() : object;
    }

    public void show(){
        System.out.println("Singleton object show ");
    }
}
