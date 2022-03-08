package com.geekster.abstractpractice;

public class MainDriver {

	public static void main(String[] args) {
		//-----------Q.3-------------------
		MatrixPractice mat1 = new MatrixPractice(3, 3);
		int k = 2;
		for(int i = 0; i< 3; i++)
		{
			for(int j= 0; j<3; j++)
			{
				mat1.setElement(i, j, k);
				k++;
			}
		}
		
		mat1.printMatrix();
		
		MatrixPractice mat2 = new MatrixPractice(3, 3);
		k = 6;
		for(int i = 0; i< 3; i++)
		{
			for(int j= 0; j<3; j++)
			{
				mat2.setElement(i, j, k);
				k++;
			}
		}
		
		mat2.printMatrix();
		
		(MatrixPractice.add(mat1, mat2)).printMatrix();
		
		//-----------Q.1-------------------
		Parent fs = new FirstSubclass();
		fs.message();
		
		Parent ss = new SecondSubclass();
		ss.message();
		
		//-----------Q.2-------------------
		StudentA s1 = new StudentA(70, 80, 90);
		StudentB s2 = new StudentB(70, 80, 90, 60);
		
		System.out.printf("Percentage of Student A = %.2f\n" ,s1.getPercentage());
		System.out.println("Percentage of Student B = " +s2.getPercentage()+ "%");

	}

}
