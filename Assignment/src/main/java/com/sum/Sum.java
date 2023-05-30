package com.sum;
import java.util.Scanner;

public class Sum {
	
	public int sumnum() {
		System.out.println("Enter two no.");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		return a+b;
	}

}
