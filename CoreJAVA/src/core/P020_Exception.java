package core;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calcualte{//b
	public void division() throws ArithmeticException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b=  ");
		int b = sc.nextInt();
		if(b>0) {
			int c = a / b;
			System.out.println(c);
		}
		else
		{
			throw new ArithmeticException();
		}
	
	}
}
public class P020_Exception { //a
	public static void main(String[] args) {
		
		try {
			Calcualte c = new Calcualte();
			c.division();
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter a = ");
//			int a = sc.nextInt();
//			System.out.println("enter b=  ");
//			int b = sc.nextInt();
//			int c = a / b;
//			System.out.println(c);
//			
//		} catch (ArithmeticException e) {
//			System.out.println("number cannot divide by zero");
//		} catch (InputMismatchException e) {
//			System.out.println("number can only divide by numeric value");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("program end");
//		}
	}
}
