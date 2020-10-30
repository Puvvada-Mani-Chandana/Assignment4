package com.assignment4.questions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String sen="";
		sen=br.readLine();
		BufferedWriter bw=new BufferedWriter(new FileWriter("file.txt"));
		bw.write(sen);
		System.out.println("stored in to the file successfully.....");
		bw.close(); br.close();
		}
}
