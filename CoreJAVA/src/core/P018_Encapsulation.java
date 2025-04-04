package core;
class Laptop{
	private int ram;
	private String model;
	private double price;
	
	public Laptop(int ram, String model, double price) {
		super();
		this.ram = ram;
		this.model = model;
		this.price = price;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRam() {
		return ram;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Laptop : ram = "+ram+" model = "+model+" price = "+price;
	}
}

public class P018_Encapsulation {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.setRam(12);
		l1.setModel("dell");
		l1.setPrice(98754.32);
		System.out.println(l1.getRam());
		System.out.println(l1.getModel());
		System.out.println(l1.getPrice());
		System.out.println(l1);
		
		Laptop l2 = new Laptop(16, "lenovo", 87540);
		System.out.println(l2);
	}
}
