package core;

interface inter1{
	public void interface1();
	public static void interfaceDefine() {
		System.out.println("interface defined function");
	}
}

interface inter2 extends inter1{
	public void interface2();
}

interface inter3 {
	public void interface3();
}

class Intercall implements inter2,inter3{

	@Override
	public void interface1() {
		// TODO Auto-generated method stub
		System.out.println("interface 1");
	}

	@Override
	public void interface3() {
		// TODO Auto-generated method stub
		System.out.println("interface 3");
	}

	@Override
	public void interface2() {
		// TODO Auto-generated method stub
		System.out.println("interface 2");
	}
	
}
public class P019_Interface {
	public static void main(String[] args) {
		Intercall i = new Intercall();
		i.interface1();
		i.interface2();
		i.interface3();
		inter1.interfaceDefine();
	}
}
