package core;

import java.util.Scanner;

public class P009_TypeCasting {
	public static void main(String[] args) {
//		int a = 10;
//		System.out.println(a);
		int i = (int)12.345;
		System.out.println(i);
		double d = 34;//implicit
		System.out.println(d);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		double c = (double)a/(double)b;
		System.out.println(c);
		
	}
}
