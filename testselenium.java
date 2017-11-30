import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class testselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver","C:\\selenuim\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine

 
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.google.com");
		driver.close();
		WebDriver driver1 = new FirefoxDriver(options);
		driver1.get("https://touch.facebook.com/");
		driver1.close();
	}

}
