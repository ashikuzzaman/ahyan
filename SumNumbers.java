package com.ahyan.math;

/**
 * to compile: javac -d . SumNumbers.java
 * to run: java com.ahyan.math.SumNumbers 23 11
 */
public class SumNumbers {

	static int number1;
	static int number2;

	public static void main(String []args) {
		if(args.length < 2) {
			System.out.println("Error! Error!! Error!!! Give me at least 2 numbers...");
		} else {
			number1 = Integer.parseInt(args[0]);
			number2 = Integer.parseInt(args[1]);
		}
		int total = number1 + number2;
		System.out.println("The total of " + number1 + " plus " + number2 + " is: " + total);	
	}

}