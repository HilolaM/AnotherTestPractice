package constructors;

public class MicroCenteer {
	public static void main(String[] args) {
		
		//Computer computer= new Computer();
		Computer laptop= new Computer("MacBookPro", "Mac", 699.99, 16);
		//Computer laptop= new Computer("MacBookPro", "Mac"); 
		//will not work, as there is no matching constr.
		
		System.out.println(laptop.getModel() +" model "+ laptop.getOs()+" $"+
		laptop.getPrice()+" ram is "+laptop.getRam());
		
		laptop.Computer();
		
		
	}

}
