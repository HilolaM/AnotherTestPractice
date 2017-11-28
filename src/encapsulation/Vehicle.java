package encapsulation;

public class Vehicle {
	private String type;
	private String make;
	
	public Vehicle(){
		type="NA";
		make= "NA";
		System.out.println("Adding a new Vehicle to the lot");
	}
	
	public Vehicle(String type, String make){
		this.type=type;
		this.make=make;		
	}
	
//	public void setMakeAndType(String type, String make){
//		setMake(make);
//		setType(type);
//	}
//	
//	public void setType(String type){
//		this.type=type;		
//	}
	public String getType(){
		return type;
	}
//	public void setMake(String make){
//		this.make=make;
//	}
	public String getMake(){
		return make;
	}
}
