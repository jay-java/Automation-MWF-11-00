package core;

import java.util.Scanner;

public class P010_Array {
	public static void main(String[] args) {
		int a = 12;
		System.out.println(a);

		int i[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int index = 0; index < i.length; index++) {
			System.out.println(i[index]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();

		int ar[] = new int[size];

		for (int index = 0; index < ar.length; index++) {
			System.out.print("enter value at ar[" + index + "] : ");
			ar[index] = sc.nextInt();
		}
		int sum = 0;
		for (int index = 0; index < ar.length; index++) {
			sum = sum + ar[index];
		}
		System.out.println("sum = " + sum);

		System.out.println("enter num to search in array : ");
		int num = sc.nextInt();
		
		int counter = 0;
		for (int index = 0; index < ar.length; index++) {
			if(num == ar[index])	 {
				counter++;
			}
		}
		if(counter>0) {
			System.out.println("yes exist "+counter+" times");
		}
		else {
			System.out.println("not exist");
		}
	}
}
