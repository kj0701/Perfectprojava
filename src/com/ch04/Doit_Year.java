package com.ch04;

import java.util.Scanner;
public class Doit_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("input year : ");
			
			int year = sc.nextInt();
			if(  year % 4 == 0 && year % 100 !=0  || year % 400 == 0) {
				System.out.println("À±³â");
			}else {
				System.out.println("Æò³â");
			}
			
		}
	}

}
