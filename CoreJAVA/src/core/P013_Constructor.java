package core;
//1.default
//2.parameterized
//3.copy
class User{
	int id;
	String name;
	long contact;
	
	public User(){
		System.out.println("this is defualt cons");
	}
	public User(int id,String name,long contact) {
		this.id = id;
		this.name = name;
		this.contact = contact;
		System.out.println("User in cons : id = "+id+" name = "+name+" contact = "+contact);
	}
	public void showData() {
		System.out.println("User in method : id = "+id+" name = "+name+" contact = "+contact);
	}
}
public class P013_Constructor {
	public static void main(String[] args) {
		User u = new User();
		u.showData();
		
		User u1 = new User(1, "java", 968653);
		u1.showData();
	}
}
