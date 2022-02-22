package com.oops;


import java.lang.reflect.Constructor;
import java.util.Scanner;

public class mainClass {

    // static block
    static {
        System.out.println("Inside static block which will be executed before main method");
    }


    public static void main(String[] args) throws Exception {
        // need object to call properties of other class
        // creating object ---> Instantiating a class

        // 1. using new keyword  ---> 99% cases
        // Syntax : className + Object name = new + constructor
        Scanner s = new Scanner(System.in);
        String name= s.nextLine();
        Students  obj1 = new Students();
        obj1.setName(name);
        obj1.setAge(26);
        obj1.setId(10);
        obj1.setMobileNumber(7679868866l);
        String studentsDetails = obj1.displayStudentDetails();
        System.out.println("Students details are through default constructor: "+ studentsDetails);

        /*Students obj2 = new Students("Niraj", 35, 100, 7678334260l);
        String studentsDetails1 = obj2.displayStudentDetails();
        System.out.println("Students details are through parameterized constructor: "+ studentsDetails1);*/

       // 2. newInstance() method of class  --> reflection
        // Syntax : ClassName + object name = ClassName+ . + Class+ forName("name of the class")+. +newInstance()
       /* Students obj3 = (Students) Class.forName("com.oops.Students").newInstance();
        String studentsDetails2 = obj3.displayStudentDetails();
        System.out.println("Students details using newInstance method of class: "+
                studentsDetails2);

        // 3. newInstance method of constructor --> reflection
        // Syntax : Constructor + constructor object name = className +.+class + getDeclaredConstructor()+ newInstance()
        Constructor<Students> constructor =Students.class.getDeclaredConstructor();
        // flag to call private constructor --> create object of Student class
        constructor.setAccessible(true);
        Students obj4 = constructor.newInstance();

        String studentsDetails3 = obj4.displayStudentDetails();
        System.out.println("Students details using newInstance method of default constructor: "+
                studentsDetails3);

        //calling the parameterized constructor using reflection
        Constructor <Students> cons =Students.class.getDeclaredConstructor(String.class, int.class,int.class,long.class);
        cons.setAccessible(true);
        Students obj5 = cons.newInstance("Neeraj", 26, 100, 7678334260l);

        String studentsDetails4 = obj5.displayStudentDetails();
        System.out.println("Students details using newInstance method of parametrized constructor: "+
                studentsDetails4);

        // to call static method --> classname + . + method name
        Students.getStaticName();
*/
    }
}
