package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenMenuButtonPage {
public WebDriver driver;
	
	By openMenu=By.id("react-burger-menu-btn");
	By About=By.id("about_sidebar_link");
	
	public OpenMenuButtonPage(WebDriver driver) {
		 this.driver=driver;
	}

	public WebElement ClickOpenMenu()
	{
		return driver.findElement(openMenu);
	}
	
	public WebElement ClickOnAbout()
	{
		return driver.findElement(About);
	}
	
}
