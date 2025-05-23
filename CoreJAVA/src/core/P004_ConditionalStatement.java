package core;

public class P004_ConditionalStatement {
	public static void main(String[] args) {
		// 1. simple if
		int a = 12, b = 12;
		// (paranthases)
		if (a > b) {
			System.out.println("yes a is greater than b");
		}

		// 2.if else
		if (a > b) {
			System.out.println("yes a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		// 3.nested if
		int age = 84;
		if (age > 18) {
			if (age < 55) {
				System.out.println("you are eligible");
			} else {
				System.out.println("age is greater than 18 but not lesss than 55");
			}
		}
		else {
			System.out.println("age is less than 18");
		}

		// 4.else if ladder
		int m = 91;
		if (m < 35) {
			System.out.println("fail");
		} else if (m >= 35 && m <= 50) {
			System.out.println("pass class");
		} else if (m >= 51 && m <= 70) {
			System.out.println("C class");
		} else if (m >= 71 && m <= 80) {
			System.out.println("B class");
		} else if (m >= 81 && m <= 90) {
			System.out.println("A class");
		} else if (m >= 91 && m <= 100) {
			System.out.println("A+ class");
		} else {
			System.out.println("invalid input");
		}

		// 5.switch case
		System.out.println("1.english\n2.hindi\n3.gujarati");
		int c = 1;
		switch (c) {
		case 1:
			System.out.println("you selected english");
			break;
		case 2:
			System.out.println("you selected hindi");
			break;
		case 3:
			System.out.println("you selected gujarati");
			break;
		default:
			System.out.println("invalid input");
		}

	}
}
