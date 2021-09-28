package com.company;

import java.util.Scanner;

public class AskNames {

	public static void main(String[] args) {
		System.out.println("Enter the name:");
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];
		for(int i = 0; i<5; i++){
			names[i] = sc.next();
			char c = Character.toUpperCase(names[i].charAt(2));
			StringBuilder b = new StringBuilder(names[i]);
			b.setCharAt(2, c);
			names[i] = b.toString();
		}
		for(int i = 0; i<5; i++) {
			System.out.println(names[i]);		
		}
		
	}

}
