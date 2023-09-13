package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write your name here: ");
		String name = sc.nextLine();
		
		System.out.println("Write your last name here: ");
		String lastName = sc.nextLine();
		
		
		System.out.println("Write your favourite color here: ");
		String favouriteColor = sc.nextLine();
		
		System.out.println("Write the day you were born here: ");
		int birthDay = sc.nextInt();
		
		System.out.println("Write the month(in numbers) you were born here: ");
		int birthMonth = sc.nextInt();
		
		System.out.println("Write the year you were born here: ");
		int birthYear = sc.nextInt();
		
		int sumDate	= 	birthDay + birthMonth + birthYear;
		String newPassword = name + '-' + lastName + '-' + favouriteColor + '-' + sumDate;
		
		System.out.println(newPassword);
		
		sc.close();
	}
}
