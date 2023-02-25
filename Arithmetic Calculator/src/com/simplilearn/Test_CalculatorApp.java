package com.simplilearn;

import java.util.Scanner;

public class Test_CalculatorApp {

	public static Scanner sc = new Scanner(System.in);
	public static Model m1 = new Model();

	public static void main(String[] args) {
		System.out.println("===============Calculator App===============");
		System.out.println("Enter a for addition");
		System.out.println("Enter b for subtraction");
		System.out.println("Enter c for multiplication");
		System.out.println("Enter d for division");
		final char ch = sc.nextLine().charAt(0);
		if (ch == 'a') {
			System.out.println("Please Enter two number");
			m1.addition(sc.nextInt(), sc.nextInt());
		} else if (ch == 'b') {
			System.out.println("Please Enter two number");
			m1.subtraction(sc.nextInt(), sc.nextInt());
		} else if (ch == 'c') {
			System.out.println("Please Enter two number");
			m1.multiplication(sc.nextInt(), sc.nextInt());
		} else if (ch == 'd') {
			System.out.println("Please Enter two number");
			m1.division(sc.nextDouble(), sc.nextDouble());
		} else {
			System.out.println("Enter the valid option");
		}
	}

}
