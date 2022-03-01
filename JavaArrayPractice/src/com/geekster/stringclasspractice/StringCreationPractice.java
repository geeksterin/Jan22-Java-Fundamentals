package com.geekster.stringclasspractice;

public class StringCreationPractice {

	 public static void main(String[] args) {

	        String name1 = "Java";
	        String name2 = "Java";
	        String name3 = name1;
	        String name4 = new String("Java");
	        String name5 = new String("Java");
	        String name6 = name2.intern();

	        name6.length();
	        String name7 = name4.intern();
	        System.out.println(name7==name4); //true
	        System.out.println(name1 == name2);
	        System.out.println(name1 == name3);
	        System.out.println(name2 == name3);


	        System.out.println(name1 == name4);//false
	        System.out.println(name1 == name5);//false
	        System.out.println(name4 == name5);//false
	        System.out.println(name6 == name2);//true
	        
	        String hi = "hi";
	        String mom = "mom";
	        System.out.println(hi.concat(mom));//himom OR hi OR mom
	        System.out.println(hi);

	        
	        StringBuilder sb1 = new StringBuilder();
	        sb1.capacity();
	    	StringBuilder sb = new StringBuilder("Able was I ere I saw Elba.");
	    	System.out.println( sb.length());
	    	System.out.println(sb.capacity());
	    
	    }
}
