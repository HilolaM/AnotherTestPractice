package encapsulation;

public class Book {
	private String title; 
	private String author; 
	private String type; 
	private double price;
	private boolean onSale;
	
	public void setBookInfo(String title, String author, String type, double price, boolean onSale){
		setTitle(title);
		setAuthor(author);
		setType(type);
		setPrice(price);
		setOnSale(onSale);
	}
	
	public void setOnSale(boolean onSale){
		this.onSale=onSale;
	}
	
	public boolean getOnSale(){
		return onSale;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	public String getTitle(){
		return title;
	}

	public void setAuthor(String author){
		this.author= author;
	}
	public String getAuthor(){
		return author;
	}
	public void setType(String type){
		this.type=type;
	}
	public String getType(){
		return type;
	}
	public void setPrice(double price){
		this.price=price;
	}
}
