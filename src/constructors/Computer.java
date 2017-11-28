package constructors;

public class Computer {
	
	private int ram;
	private String model;
	private String os;
	private double price;
	
	public Computer(){
		System.out.println("No argument constractor......");
	}
	public Computer(String model){
		System.out.println("Constractor with model");
	}
	
	public void Computer(){
		System.out.println("No argument method with same name as class");
	}
	public Computer(String model, String os, double price, int ram){
		this("Dell");
		this.ram= ram; 
		this.model= model;
		this.os= os;
		this.price=price;
	}
	
	public int getRam() {
		return ram;
	}
	public String getModel() {
		return model;
	}
	public String getOs() {
		return os;
	}
	public double getPrice() {
		return price;
	}
	
	
	

}
