package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginObject;

public class LoginTests {

	LoginObject lg;

	public LoginTests() {
		lg = new LoginObject();
	}
	
	
	@Test
	public void verifyLogin(){
		lg.login("Abuthaheer456", "PE64C9");
		lg.login("Abuthaheer123", "PE64C9");
		Assert.assertTrue(lg.getTitlte().contains("Search"), 
				"Failed: Login not successfull");
	}
	

}
