package constructors;

import org.openqa.selenium.WebDriver;

public class Etsy {
	private WebDriver driver;
	
		public Etsy(WebDriver driver){
			this.driver=driver;
		}
	public void goTo(){
		driver.get("http://www.etsy.com");
	}
		
}
