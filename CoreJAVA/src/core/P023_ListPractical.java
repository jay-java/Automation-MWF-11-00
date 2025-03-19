package core;

import java.util.ArrayList;
import java.util.List;

class Users {
	private int id;
	private String name;
	private long contact;

	public Users() {
		super();
	}

	public Users(int id, String name, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}

}

public class P023_ListPractical {
	public static void main(String[] args) {
		Users u1 = new Users(1, "java", 9876540);
		Users u2 = new Users(2, "python", 9876540);
		Users u3 = new Users(3, "php", 9876540);
		Users u4 = new Users(4, "dart", 9876540);
		
		List<Users> list= new ArrayList<Users>();
		list.add(u1);
		list.add(u2);
		list.add(u3);
		list.add(u4);
		
		System.out.println(list);
		
		for(Users u:list) {
			System.out.println(u);
		}
	}
}
