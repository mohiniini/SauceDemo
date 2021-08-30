package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddToCartPage {

	WebDriver driver;

	By addtocartButton=By.id("add-to-cart-sauce-labs-fleece-jacket");
	By addtocartIcon=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	By checkout=By.id("checkout");
	By firstname=By.id("first-name");
	By lastname=By.id("last-name");
	By zipcode=By.id("postal-code");
	By continueButton=By.id("continue");
	By txt=By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]");
	
	

	public AddToCartPage(WebDriver driver) {
		 this.driver=driver;
	}


	public void clickselectDropdown()
	{
		WebElement selectDropdown=driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
		//return driver.findElement(selectDropdown);
		Select fruits = new Select(selectDropdown);
		fruits.selectByIndex(3);
	}
	
	public WebElement clickaddtocart()
	{
		return driver.findElement(addtocartButton);
	}
	
	public WebElement clickaddtocartIcon()
	{
		return driver.findElement(addtocartIcon);
	}
	
	public WebElement clickCheckoutButton()
	{
		return driver.findElement(checkout);
	}
	
	public WebElement txtfirstname()
	{
		return driver.findElement(firstname);
	}
	
	public WebElement txtlastname()
	{
		return driver.findElement(lastname);
	}
	
	public WebElement txtzipcode()
	{
		return driver.findElement(zipcode);
	}
	
	public WebElement clickcontinueButton()
	{
		return driver.findElement(continueButton);
	}
	
	public WebElement graptxt()
	{
		return driver.findElement(txt);
	}
}
