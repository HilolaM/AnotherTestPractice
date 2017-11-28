package constructors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"/Users/ilhomhasanov/Documents/Libraries/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		Etsy etsy= new Etsy(driver);
		etsy.goTo();
	}

}
