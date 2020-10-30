package com.assignment4.questions;
import java.io.IOException;
public class Question7 {
	public static void main(String[] args) {
		ExceptionSample es = new ExceptionSample();
				try {
					es.throwException();
				} catch (InputException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
}
