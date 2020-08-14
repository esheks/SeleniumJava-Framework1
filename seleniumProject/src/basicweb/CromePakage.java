package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromePakage {

	public static void main(String[] args) {
		String baseUrl = "http://www.google.com";
		WebDriver driver; 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Esheku\\Desktop\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(baseUrl);
	}

}
