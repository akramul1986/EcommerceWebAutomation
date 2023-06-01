package tests;

import org.testng.annotations.Test;
import pages.signup;


public class TestCase1 extends BaseTest {
	@Test
	
  
public void OpenFreeVieoAndPlayTheVideo() throws Exception {
	  
	  signup asignup = new signup(driver);
	  asignup.GoToEcomerseSite("https://www.demoblaze.com/");
//	  aHomePage.ScrollDown();
//	  aHomePage.ClickOnFreeContent(3);
//	  aHomePage.PlayVideoFullScreenMode();
	  
  }
}
