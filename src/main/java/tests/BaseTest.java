package tests;

import org.testng.annotations.BeforeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {
	 protected WebDriver driver;
	//protected HomePage page;
	
  @BeforeTest
  public void initDriver() throws Exception {
	  
	  String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", path+ "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(25000);
		}

//  @AfterTest
//  public void tearDown() throws Exception{
//	  Thread.sleep(60000);
//      if(null != driver){
//          driver.quit();
//      }
//      System.out.println("Successfully close the browser");
//  }

}

