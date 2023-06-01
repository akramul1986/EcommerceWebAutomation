package tests;

import org.testng.annotations.Test;
import pages.signup;


public class TestCase1 extends BaseTest {
	
@Test
public void OpenDemoSite() throws Exception {
	  
	  signup asignup = new signup(driver);
	  asignup.GoToEcomerseSite("https://www.demoblaze.com/");  
  }
@Test
public void OpenSignUp() throws Exception {
	  
	  signup asignup = new signup(driver);
	  asignup.singnUP("Akramul Islam", "Akram123");
}

}
