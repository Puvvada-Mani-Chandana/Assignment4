package com.assignment4.questions;

import java.util.Scanner;

public class Question5 {

	public static void main(String args[]) {
	try {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		try {
			if(n > 100) {
				throw new Exception();
			}
		}catch (Exception e) {
			System.out.println("Number can't be greater than 100");
		}
	}catch(Exception e) {}
	}
}
