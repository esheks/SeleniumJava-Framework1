package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		WebDriver driver; 
		//System.setProperty("webdriver.gecko.driver", "/Users/Esheku/Desktop/selenium/geckodriver.exe");
		driver = new FirefoxDriver();
		String baseUrl = "http://www.google.com";
		driver.get(baseUrl);
	}

}
