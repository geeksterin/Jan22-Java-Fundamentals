package com.array;

public class ArraySerachElement {

    public static void main(String[] args) {

        int [] roll ={1,2,3,4,5,6,7,8,9,10};
        int searchRoll1= 9;
        int searchRoll2= 11;

        //calling search method
       /* boolean ifPresent = searchElement(roll,searchRoll1);
        boolean ifPresent1 = searchElement(roll,searchRoll2);
        System.out.println("Rollnumber "+searchRoll1 +" present :"+ ifPresent);
        System.out.println("Rollnumber "+searchRoll2 +" present : "+ ifPresent1);*/

        //calling delete method
        String delete = deleteRollNumbers(roll,5);
        System.out.println( delete);

        String delete1 = deleteRollNumbers(roll,50);
        System.out.println( delete1);

    }

    //Creating method to search roll numbers
    private static boolean searchElement(int[] rollNumbers, int searchRollnumber){
        boolean isPresent = false;
        for(int index=0;index<rollNumbers.length;index++){
            if(rollNumbers[index] == searchRollnumber){
                isPresent= true;
                break;
            }
        }
        return isPresent;
    }

    // delete an element from an array
    private static String deleteRollNumbers(int[] rollNumbers, int deleteRollnumber){
        String deleteMessage ="Roll number could not be found";
        for(int index =0;index<rollNumbers.length;index++){
            if(rollNumbers[index] == deleteRollnumber){
                rollNumbers[index] = Integer.MIN_VALUE; //0
                deleteMessage= "Roll number deleted successfuly";
                break;
            }
        }
        return  deleteMessage;
    }

}
