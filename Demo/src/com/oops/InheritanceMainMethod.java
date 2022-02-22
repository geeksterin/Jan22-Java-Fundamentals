package com.oops;

public class InheritanceMainMethod {

    public static void main(String[] args) {
        // Single Inheritance
        Suv s = new Suv();
        System.out.println( s.getWheels());
        System.out.println( s.getMilege());

        // multilevel inheritance
        Bolero b = new Bolero();
        System.out.println( s.getWheels());
        System.out.println( s.getMilege());

    }
}
