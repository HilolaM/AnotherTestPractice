package encapsulation;

public class Library {
	public static void main(String[]args){
		Book book1= new Book();
		
		book1.setAuthor("Unmesh");
		book1.setTitle("Selenium Cookbook");
		book1.setType("hardcover");
		book1.setPrice(36.89);
		book1.setOnSale(false);
	
		Book book2= new Book();
		
		book2.setAuthor("Ron Patton");
		book2.setTitle("Software Testing");
		book2.setType("ebook");
		book2.setPrice(19.99);
		book2.setOnSale(true);
		
		book2=book1;
		System.out.println(book2.getTitle());
		System.out.println(book1.getAuthor());
		
		book2.setOnSale(true);
		System.out.println(book1.getOnSale());
		
		Book book3=new Book();
		
		book3.setBookInfo("Intro to Java", "Yang", "ebook", 19.65, true);
		System.out.println(book3.getTitle()+ " " + book3.getAuthor());
	}
}
