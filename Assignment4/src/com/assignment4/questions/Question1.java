package com.assignment4.questions;
import java.io.*;
public class Question1 {
	
	   public static void main(String[] args) throws IOException {
	      FileInputStream in = null;
	 try {
	         in = new FileInputStream("info.txt");
	         int br=0;
	       
	         while ((br = in.read()) != -1) {
	           System.out.println((char)br); 
	         }
	      } catch (IOException ex) {
	         ex.printStackTrace();
	      } finally {  
	         try {
	            in.close();
	         } catch (IOException ex) {
	            ex.printStackTrace();
	         }
	      }
	   }
	}

