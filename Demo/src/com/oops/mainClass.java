package com.oops;

import java.lang.reflect.Constructor;

public class mainClass {

    public static void main(String[] args) throws Exception {


        // need object to call properties of other class
        // creating object ---> Instantiating a class

        // 1. using new keyword  ---> 99% cases
        // Syntax : className + Object name = new + constructor
        Students  obj1 = new Students();
        String studentsDetails = obj1.displayStudentDetails();
        System.out.println("Students details are through default constructor: "+ studentsDetails);

        Students obj2 = new Students("Niraj", 35, 100, 7678334260l);
        String studentsDetails1 = obj2.displayStudentDetails();
        System.out.println("Students details are through parameterized constructor: "+ studentsDetails1);

        // 2. newInstance() method of class  --> reflection
        // Syntax : ClassName + object name = ClassName+ . + Class+ forName("name of the class")+. +newInstance()
        Students obj3 = (Students) Class.forName("com.oops.Students").newInstance();
        String studentsDetails2 = obj3.displayStudentDetails();
        System.out.println("Students details using newInstance method of class: "+
                studentsDetails2);

        // 3. newInstance method of constructor --> reflection
        // Syntax : Constructor + constructor object name = className +.+class + getDeclaredConstructor()+ newInstance()
        Constructor <Students> constructor =Students.class.getDeclaredConstructor();
        Students obj4 = constructor.newInstance();
        String studentsDetails3 = obj4.displayStudentDetails();
        System.out.println("Students details using newInstance method of constructor: "+
                studentsDetails3);


    }
}
