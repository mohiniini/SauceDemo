package Academy;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.AddToCartPage;
import PageObjects.LoginPage;
import PageObjects.OpenMenuButtonPage;
import resources.base;

public class AddToCart extends base {
	WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException
	{
		 driver =initializeDriver();
	}

	@Test(dataProvider="getData")
	public void validateAppTitle(String Username,String Password) throws IOException, InterruptedException
	{
		 driver.get(prop.getProperty("url"));
		 
		 LoginPage lp=new LoginPage(driver);
			lp.getEmail().sendKeys(Username);
			lp.getPassword().sendKeys(Password);
			lp.getLogin().click();
			Thread.sleep(3000);
		 AddToCartPage l=new  AddToCartPage(driver);
		 l.clickselectDropdown();
		 Thread.sleep(2000);
		 l.clickaddtocart().click();
		 l.clickaddtocartIcon().click();
		 l.clickCheckoutButton().click();
		 l.txtfirstname().sendKeys("mohini");
		 l.txtlastname().sendKeys("lal");
		 l.txtzipcode().sendKeys("203323");
		 JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,600)");
			l.clickcontinueButton().click();
			l.graptxt().getText();
		 Thread.sleep(7000);
	
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		//0th row
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";

		return data;
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	
	}
	
}
