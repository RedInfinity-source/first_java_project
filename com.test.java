package com.test.java;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		// first number
		Scanner number = new Scanner(System.in);
		System.out.print("> ");
		// Second number
		int Number_1 = number.nextInt();
		System.out.print("> ");
		
		// print answer
		int Number_2 = number.nextInt();
		System.out.print(Number_1  + " + "  + Number_2 + " = ");
		System.out.print(Number_1 + Number_2);
		
	}
}
