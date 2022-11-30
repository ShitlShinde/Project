package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tempt 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Automation Support\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Apply implicit wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//openApplication
		driver.get("https://www.flipkart.com/");
		
		//cancel login page
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();		
		
		//Navigate to login
		Actions act=new Actions(driver);
		WebElement login=driver.findElementByXPath("//*[text()='Login']");
		act.moveToElement(login).build().perform();
		
		//Click on profile
		driver.findElementByLinkText("My Profile").click();
		
		//Enter mobile number
		driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("8308440478");
		
		//Enter password
		driver.findElementByXPath("//*[@type='password']").sendKeys("pa$$w0rd");
		
		//Click on login
		driver.findElementByXPath("(//*[@type='submit'])[2]").click();
		
		/*Click on continue
		driver.findElementByXPath("(//*[@type='submit'])[2]").click();
		Thread.sleep(5000);*/
		
		//click on Manage Addresses
		driver.findElementByXPath("(//*[@class='NS64GK'])[1]").click();
		
		//click on add a new addresses
		driver.findElementByXPath("//*[@class='_1QhEVk']").click();
		
		driver.findElementByXPath("//*[@name='name']").sendKeys("Shital");
		driver.findElementByXPath("//*[@name='phone']").sendKeys("8308440478");
		driver.findElementByXPath("//*[@name='pincode']").sendKeys("423604");
		driver.findElementByXPath("//*[@name='addressLine2']").sendKeys("Chas(nali)");
		driver.findElementByXPath("//*[@name='addressLine1']").sendKeys("Chas(nali),Kopargaon");
		//driver.findElementByXPath("//*[@name='city']").sendKeys("Ahmednagar");
		
		/*Select state=new Select(driver.findElementByXPath("//*[@name='state']"));
		state.selectByValue("Maharashtra");*/
		Thread.sleep(5000);
		//click on home
		driver.findElementByXPath("(//*[@class='_1XFPmK'])[1]").click();
		
		//click on save
		driver.findElementByXPath("(//*[@type='button'])[2]").click();
		
		//driver.findElementByXPath("//*[@class='_2KpZ6l _3X1Ag9 _3dESVI']").click();
	}

}


