package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class signup {
	
	
	WebDriver driver;
	String URL;
	String Name;
	String Password;

	public signup(WebDriver driver) {
		this.driver = driver;
	}
	
	@Test (priority=0)
	public void GoToEcomerseSite(String url,String name) throws Exception {
		this.URL = url;
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='nav-link'][contains(.,'Sign up')]")).click();
		System.out.println("User successfully redirect to SignUp page ");
	    Thread.sleep(20000);
		
	}
	public void singnUP(String name, String password) {
		this.Name = name;
		this.Password= password;
		driver.findElements(By.id(""));
		driver.findElements(By.id(""));
	}

}
