package com.ahyan.math;

/**
 * to compile: javac -d . CalculateNumbers.java
 * to run: java com.ahyan.math.CalculateNumbers * 23 11
 */
public class CalculateNumbers {
	static String operator;
	static int number1;
	static int number2;

	public static void main(String []args) {
		if(args.length < 3) {
			System.out.println("Error! Error!! Error!!! Give me an operator and at least 2 numbers...");
		} else {
			operator = args[0];
			number1 = Integer.parseInt(args[1]);
			number2 = Integer.parseInt(args[2]);
		}
		int result = 0;
		if(operator.equals("+")) {
			result = number1 + number2;
		} else if(operator.equals("-")) {
			result = number1 - number2;
		} else if(operator.equals("*")) {
			result = number1 * number2;
		} else if(operator.equals("/")) {
			result = number1 / number2; 
		}


		System.out.println("The result of " + number1 + operator + number2 + " is: " + result);	
	}

}