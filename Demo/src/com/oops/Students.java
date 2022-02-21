package com.oops;

// modifier, class keyword, class name
public class Students {

    // class body
    // Instance variable / class variable
    private String name;
    private int age;
    private int id;
    private long mobileNumber;

    // constructor : method with the same name as class and no return type
    // default constructor --> created automatically by the compiler in JVM --> to create the object
    public Students(){
        // don't have any body
    }

    // Parameterized constructor
    public Students(String name, int age, int id, long mobileNumber){
        this.name = name;
        this.age = age;
        this.id=id;
        this.mobileNumber=mobileNumber;
    }


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
    public long getMobileNumber(){
        return mobileNumber;
    }

    public String displayStudentDetails(){
            return getName() +" "+getAge()+" "+getId()+" "+getMobileNumber();
    }



}
