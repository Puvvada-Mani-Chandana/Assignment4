package com.assignment4.questions;

import java.io.Serializable;

public class BankAccountQ3  implements Serializable{
		private String name;
		private String id;
		private String address;
		private transient double salary;
		
		
		public BankAccountQ3() {}
		
		
		public BankAccountQ3(String name, String id, String address, double salary) {
			this.name = name;
			this.id = id;
			this.address = address;
			this.salary = salary;
		}
		
		public void display() {
			System.out.println("name : "+this.name+"id : "+this.id+"address : "+this.address+"salary : "+this.salary);
		}
}
