package com.assignment4.questions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question4 {
	private static void EvenNOdd(int n) {
		if(n%2==0) {
			System.out.println("Even number....");
		}
		else{
			System.out.println("Odd number.....");
		}
		
}		
 public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=0;
		try {
			do {
				System.out.println("Enter a number or else for quiting enter -1");
				n=scanner.nextInt();
				EvenNOdd(n);
			}while(n!=-1);
	}
		catch(InputMismatchException e) {
			System.out.println("Please Enter Integer only1");
			
		}

 }
}
