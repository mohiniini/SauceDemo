package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	

	public WebDriver driver;
	
	By email=By.id("user-name");
	By password=By.id("password");
	By login=By.id("login-button");
	
	
	

	public LoginPage(WebDriver driver) {
		 this.driver=driver;
	}


	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}
	
	


}
