package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	public  WebDriver driver; 
	public Properties prop;
		public WebDriver initializeDriver() throws IOException 
		{
			 prop= new Properties();
			FileInputStream fis=new FileInputStream("F:\\seleniumCode\\SauceDemoProject\\src\\main\\java\\resources\\data.properties");
			prop.load(fis); // load is the method which take fis is an argument
			String browserName=prop.getProperty("browser");
			if(browserName.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
				 driver =new ChromeDriver();
				
			}
			
			else if(browserName.equals("IE")) {
				
				
			}
			
			else if(browserName.equals("firefox")) {
				
				
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			return driver;
		}
		
		
		public void getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			File source =ts.getScreenshotAs(OutputType.FILE);
			String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
			FileUtils.copyFile(source,new File(destinationFile));
			
		}

	

}
