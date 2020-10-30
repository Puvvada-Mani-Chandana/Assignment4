package com.assignment4.questions;

import java.util.Scanner;

public class Question6 {

	public static void main(String args[]) {
		try{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number");
			int number = scanner.nextInt();
			try {
				if(number > 100) {
					throw new InputException("number can't be greater than 100");
				}
			} catch (InputException e) {
				System.out.println(e.getMessage());
			}
		}catch(Exception e) {}
	}
}
