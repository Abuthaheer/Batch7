package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObject extends BasePage {

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement passWord;

	@FindBy(id = "login")
	private WebElement btnLogin;

	public LoginObject() {
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String name) {
		// userName.sendKeys(name);

		setText(userName, name);
	}

	public String getUserName() {
		return getTxtAttribute(userName, "value");
	}

	public void login(String user, String pass) {
		setText(userName, user);
		setText(passWord, pass);
		
	}

}
