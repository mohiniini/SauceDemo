package Academy;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password) throws IOException, InterruptedException
	{
		
		
		 driver.get(prop.getProperty("url"));
		 LoginPage lp=new LoginPage(driver);
			lp.getEmail().sendKeys(Username);
			lp.getPassword().sendKeys(Password);
			lp.getLogin().click();
			Thread.sleep(3000);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
//		// Row stands for how many different data types test should run
//		//coloumn stands for how many values per each test
//		
//		// Array size is 2
//		// 0,1
		Object[][] data=new Object[1][2];
		//0th row
		data[0][0]="standard_user";
		data[0][1]="secret_sauce";
	
		//1st row
//		data[1][0]="restricteduser@qw.com";
//		data[1][1]="456788";
//		data[1][2]= "Non restricted user";
		
		return data;
	
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	
	}

}
