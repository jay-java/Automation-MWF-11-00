package core;

import java.util.Scanner;

public class P012_String {
	public static void main(String[] args) {
		char c[] = {'j','a','v','a','/','$','1'};
		System.out.println(c);
		String name = "java is best teech to learn in 2025";
		System.out.println(name);
		System.out.println(name.charAt(4));
		System.out.println(name.length());
		String s1 = "java";
		String s2 = "javA";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3 = "				jav a			";
		System.out.println(s3);
		System.out.println(s3.trim());
	
		Scanner sc  =new Scanner(System.in);
		
		System.out.println("enter name = ");
		String username = sc.nextLine();
		System.out.println(username);
		
		
	}
}
