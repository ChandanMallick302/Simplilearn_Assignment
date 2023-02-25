package com.simplilearn;

public class Model {

	private static double num1;
	private static double num2;
	private int addition;
	private int subtraction;
	private int multiplication;
	private double division;

	public void addition(int num1, int num2) {

		this.num1 = num1;
		this.num2 = num2;
		addition = num1 + num2;
		System.out.println("The additon is " + addition);
	}

	public void subtraction(int num1, int num2) {

		this.num1 = num1;
		this.num2 = num2;
		subtraction = num1 - num2;
		System.out.println("The subtraction is " + subtraction);
	}

	public void multiplication(int num1, int num2) {

		this.num1 = num1;
		this.num2 = num2;
		multiplication = num1 * num2;
		System.out.println("The multiplication is " + multiplication);
	}

	public void division(double num1, double num2) {

		this.num1 = (double) num1;
		this.num2 = (double)num2;
		division = num1 / num2;
		System.out.println("The division is " + division);
	}
}
