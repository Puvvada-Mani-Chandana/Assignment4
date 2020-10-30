package com.assignment4.questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Question3 {

	public static void main(String[] args) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.ser"));
			BankAccountQ3 account = new BankAccountQ3("chandana","ABC13","Bhimavaram",50000);
			out.writeObject(account);
			account.display();
			System.out.println("data successfully serialized..!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.ser"));
			BankAccountQ3 acc = (BankAccountQ3) in.readObject();
			acc.display();
			System.out.println("deserialized data successfully....!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
		
}

