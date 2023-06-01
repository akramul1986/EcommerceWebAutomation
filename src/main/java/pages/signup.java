package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
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
	public void GoToEcomerseSite(String url) throws Exception {
		this.URL = url;
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='nav-link'][contains(.,'Sign up')]")).click();
		System.out.println("User successfully redirect to SignUp page ");
	    Thread.sleep(200);
		
	}
	public void singnUP(String name, String password) throws InterruptedException {
		this.Name = name;
		this.Password= password;
		driver.findElement(By.id("sign-username")).sendKeys(name);
		driver.findElement(By.id("sign-password")).sendKeys(password);
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		System.out.println("User successfully Signup for the site ");
		driver.findElement(By.id("ok")).click();
		
	}

}
