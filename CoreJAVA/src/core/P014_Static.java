package core;

class Employee{
	public void call() {
		System.out.println("call in employee");
	}
	public static void callEmpl() {
		System.out.println("call static emp");
	}
}
public class P014_Static {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.call();
		
		Employee.callEmpl();
	}
}
