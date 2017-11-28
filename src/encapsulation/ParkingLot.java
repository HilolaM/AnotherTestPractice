package encapsulation;

public class ParkingLot {
	public static void main(String[] args) {
		
		String url= "www.etsy.com";
		String baseUrl= new String ("www.etsy.com");
		
		System.out.println(url + "\n" + baseUrl);
//		Vehicle vehicle= new Vehicle();		
//		vehicle.setMake("Tesla");
//		vehicle.setType("Sedan");		
//		vehicle.setMakeAndType("Economy", "Honda");
//	
//		System.out.println(vehicle.getType()+" made by "+vehicle.getMake());

		Vehicle vehicle1= new Vehicle("Truck", "PeterBuilt");
		
		System.out.println(vehicle1.getType()+" made by "+ vehicle1.getMake() );
	}	
}
