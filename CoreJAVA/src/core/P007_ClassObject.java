package core;

class Student{
	int rollno;
	double per;
	long contact;
	public void abcClas() {
		System.out.println("abc class");
	}
	public void showStudentData() {
		System.out.println("roll no : "+rollno+" per  : "+per+" contact : "+contact);
	}
}

public class P007_ClassObject {
	public static void main(String[] args) {
		System.out.println("main class");
//		ClassName objectName = new Constructor(ClassName);
		Student s1 = new Student();
		s1.rollno = 12;
		s1.per=56.5;
		s1.contact = 9874654;
		s1.showStudentData();
		
		Student s2 = new Student();
		s2.rollno = 13;
		s2.per=85.5;
		s2.contact = 98746544;
		s2.showStudentData();
	}
}
