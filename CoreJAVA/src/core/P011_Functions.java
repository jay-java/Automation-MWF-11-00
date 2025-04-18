package core;

import java.util.Scanner;

//without arguments without return type.
//without arguments with return values
//with arguments without return values
//with arguments with return values
class ABC {
	// without arguments without return type.
	public void call() {
		System.out.println("this is without arguments without return type");
	}

	// without arguments with return type
	public double returnNum() {
		return 12456.345;
	}

	// with arguments without return type
	public void withArg(int num) {
		System.out.println("num : " + num);
	}

	// with arguments with return values
	public int getSquare(int num) {
		System.out.println("num coming from main method is : " + num);
		return num*num;
	}

	public boolean checkEmail(String email) {
		return true;
	}
	
}

public class P011_Functions {
	public static void main(String[] args) {
		ABC a = new ABC();
		a.call();

		double res = a.returnNum();
		System.out.println(res);

		a.withArg(1234);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter num to get Sqaure : ");
		int num = sc.nextInt();
		System.out.println(num + " is pass to getSquare function");
		int res1 = a.getSquare(num);
		System.out.println("square of " + num + " is : " + res1);
	}
}
