package core;

import java.util.Scanner;

public class P008_UserInput {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b  =sc.nextInt();
		int c = a+b;
		System.out.println("addition of a and b = "+c);
		System.out.println("enter double value : ");
		double d = sc.nextDouble();
		System.out.println("d = "+d);
	}
}
