package simpleCalculator;

import java.util.Scanner;

public class additionClass {
	public additionClass()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("enter first number");
		double num1 = in.nextDouble();
		System.out.println("enter second number");
		double num2 = in.nextDouble();
		double result = num1+num2;
		System.out.println("addition of the entered numbers" +result);
				
		
	}

}