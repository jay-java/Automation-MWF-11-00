package core;

class Overload {
	public int add(int a,int b) {
		return a+b;
	}

	public int add(int a,int b,int c) {
		return a+b+c;
	}

	public int add(int a,int b,int c,int d) {
		return a+b+c+d;
	}

}

class Parent1{
	public void call() {
		System.out.println("call in parent");
	}
}
class Child1 extends Parent1{
	public void call() {
		super.call();
		System.out.println("call in child");
	}
}

public class P016_Polymorphism {
	public static void main(String[] args) {
		Overload o = new Overload();
		int res1=  o.add(1, 2);
		System.out.println(res1);
		
		int res2=  o.add(1, 2,3);
		System.out.println(res2);
		
		int res3=  o.add(1, 2,3,4);
		System.out.println(res3);
		
		Child1 c = new Child1();
		c.call();
	}
}
