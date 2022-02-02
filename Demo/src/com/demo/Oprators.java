package com.demo;


public class Oprators {

    public static void main(String[] args) {
 /*       //Airthmatic operators
        // +, -, /, *
        int a= 11;
        int b= 5;
        // % -- > Modulus Operator : Binary Operator ---> gives remender
        int c = a % b;
        System.out.println(c);

        // Post/ Pre increment/ decrement ---> ++, -- : Unary operator;
        int x = 10;
        x++; // Post increment -- > increases value by 1
        System.out.println("x" + x);
        int z = 11;
        int y = z++; // y=z ; z= z+1;
        System.out.println("y ="+ y);
        System.out.println("z =" +z);

        // Post decrement
        int  p = 15;
        p --; // Post decrement -- > decreases value by 1
        System.out.println("p ="+p);
        int r= 16;
        int q= r--; // q=r ; r=r-1
        System.out.println( "q= "+q);
        System.out.println("r ="+ r);

        *//**************************************//*
        // Pre increment
        int s = 20;
        ++s; // s =s+1
        System.out.println(" s = "+s);
        int t= 21;
        int u = ++t; // t = t+1 ; u=t
        System.out.println("u ="+ u);
        System.out.println("t ="+ t);

        // pre decrement
        int s1 = 22;
        --s1; // s =s-1
        System.out.println(" s1 = "+s1);
        int t1= 23;
        int u1 = --t1; // t1 = t1-1 ; u1=t1
        System.out.println("u1 ="+ u1);
        System.out.println("t1 ="+ t1);*/

        // Assignment operators
        // = , +=, *=, /=, %=
       /* int i = 10;
        i +=  2; // i = i + 2
        System.out.println(i);
        i *= 2; // i= i * 2
        System.out.println(i);
        i/=2; //i =i/2;
        System.out.println(i);
        i%=2; //i=i%2;
        System.out.println(i);*/

        // Comparison operator --> <, >, ==,<=, >= ---> returns boolean value
       /* int j = 5;
        int k = 10 ;
        boolean rel = j<k;
        System.out.println( rel);
        boolean rel1 = j>k;
        System.out.println( rel1);
        int m= 15;
        int n= 15;
        System.out.println(m == n);
        int p = 11;
        int q =13; // p =11
        System.out.println(p <= q);// p should be either less or equal to q
        System.out.println(p >=q); // p should be either greater or equal to q*/

        // Logical operator ---> && (AND) || (OR) != (Not equal to) --> Binary operator
        String name ="Neeraj";
        int age = 26;
        // AND operator is used to check if two conditions
        // if name of user has 5 character AND age is less than equal 30 the print you are selected !
        //condition :
        boolean whetherTrue =  name.length() == 5  &&  age <= 30; // 6 < 5 --> false ; 26<=30 --> true
        //false + true = false
        System.out.println(whetherTrue);

        // OR : is used to check if any one of the 2 given conditions are true
        // if name of user has 5 character OR age is less than equal 30 the print you are selected !
        //Condition :
        boolean whetherFalse = name.length()== 5 || age<=30; // 6<5 -->false ; 26<=30 --> true
        // false + true = true
        System.out.println(whetherFalse);

        // != (Not equal to)
      /*  int z= 25;
        int y= 27;
        boolean ifTrue =  z !=y; // 25 < 27 = 25 Not equal to 27
        System.out.println(ifTrue);

        int z1= 25;
        int y1= 25;
        boolean ifTrue1 =  z1 !=y1; // 25 == 25
        System.out.println(ifTrue1);*/



    }

}
