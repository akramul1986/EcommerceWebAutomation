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
//	  
//	  	Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("profile.default_content_setting_values.notifications", 2);
		
//	    ChromeOptions options = new ChromeOptions();
//		options.addExtensions(new File(path+"\\Driver\\extension_4_38_0_0.crx"));
		
		
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//		options.merge(capabilities);
//		options.setExperimentalOption("prefs", prefs);

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

