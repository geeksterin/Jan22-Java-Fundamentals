package com.oops;

// modifier, class keyword, class name
public class Students {

    // class body
    // Instance variable / class variable
    private String name;
    private int age;
    private int id;
    private long mobileNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public static String getNameStatic() {
        return nameStatic;
    }

    public static void setNameStatic(String nameStatic) {
        Students.nameStatic = nameStatic;
    }

    // static field/variable
    private static String nameStatic;

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



    public String displayStudentDetails(){
            return getName() +" "+getAge()+" "+getId()+" "+getMobileNumber();
    }

    // static method
    public static void getStaticName(){
        // we canot access instance field/ variable or instance method/ non-static method from static method
        nameStatic= "Neeraj Srivastava";
        System.out.println("Inside static method of Student class : " + nameStatic);
    }
    // why do we need static method or static variables??
    //We can not call non-static method/variable( instance methods or instance variable) from static method.

}
