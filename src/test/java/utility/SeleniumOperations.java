package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{
	public static ChromeDriver driver=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	//brawserLaunch
	public static Hashtable<String,Object> brawserLaunch(Object[] inputParameters)
	{
		try
		{
			
		
		String key=(String) inputParameters[0];
		String value=(String) inputParameters[1];
		
		System.setProperty(key,value);
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:brawserLaunch, InputGiven: "+inputParameters[0].toString());
		}
		
		catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:brawserLaunch, InputGiven: "+inputParameters[0].toString());
		}
		return outputParameters;
	}
	
   
	//openApplication
	public static Hashtable<String,Object> openApplication(Object[] inputParameters)
	{
		try
		{
		String url=(String) inputParameters[0];
		driver.get(url);  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:openApplication, InputGiven: "+inputParameters[0].toString());
		}
		catch(Exception e) 
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:openApplication, InputGiven: "+inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//click by xpath
		public static Hashtable<String,Object> clickOnElement(Object[] inputParameters)
		{
			try
			{
			String xpath=(String) inputParameters[0];
			driver.findElementByXPath(xpath).click();	
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:clickOnElement, InputGiven: "+inputParameters[0].toString());
			}
			catch(Exception e) 
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "methodUsed:clickOnElement, InputGiven: "+inputParameters[0].toString());
			}
			return outputParameters;
		}
		
		
		//mouseOverAction
				public static static Hashtable<String,Object> mouseOver(Object[] inputParameters)
				{
					try
					{
					String xpath=(String) inputParameters[0];
					Actions act=new Actions(driver);
					WebElement a=driver.findElementByXPath(xpath);
					act.moveToElement(a).build().perform();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
					outputParameters.put("STATUS", "PASS");
					outputParameters.put("MESSAGE", "methodUsed:mouseOver, InputGiven: "+inputParameters[0].toString());
					}
					catch(Exception e) 
					{
						outputParameters.put("STATUS", "FAIL");
						outputParameters.put("MESSAGE", "methodUsed:mouseOver, InputGiven: "+inputParameters[0].toString());
					}
					return outputParameters;
				}
				
				
				//click by linkText
				public static  Hashtable<String,Object> clickByLinkText(Object[] inputParameters)
				{
					try
					{
					String text=(String) inputParameters[0];
					driver.findElementByLinkText(text).click();	
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
					outputParameters.put("STATUS", "PASS");
					outputParameters.put("MESSAGE", "methodUsed:clickByLinkText, InputGiven: "+inputParameters[0].toString());
					}
					catch(Exception e) 
					{
						outputParameters.put("STATUS", "FAIL");
						outputParameters.put("MESSAGE", "methodUsed:clickByLinkText, InputGiven: "+inputParameters[0].toString());	
					}
					return outputParameters;
				}	
				
				
				//sendKeys
				public static  Hashtable<String,Object> sendKeys(Object[] inputParameters)
				{
					try
					{
					String xpath1= (String) inputParameters[0];
					String text1= (String) inputParameters[1];
					driver.findElementByXPath(xpath1).sendKeys(text1);
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
					outputParameters.put("STATUS", "PASS");
					outputParameters.put("MESSAGE", "methodUsed:sendKeys, InputGiven: "+inputParameters[1].toString());
					}
					catch(Exception e) 
					{
						outputParameters.put("STATUS", "FAIL");
						outputParameters.put("MESSAGE", "methodUsed:sendKeys, InputGiven: "+inputParameters[1].toString());	
					}
					return outputParameters;
				}
		
		
				//validateLogin
				public static  Hashtable<String,Object> validateLogin(Object[] inputParameters)
				{
					try
					{
					String requiredUrl= (String) inputParameters[0];
					String catchUrl=driver.getCurrentUrl();	
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
					outputParameters.put("STATUS", "PASS");
					outputParameters.put("MESSAGE", "methodUsed:validateLogin, InputGiven: "+inputParameters[0].toString());

					
					if(catchUrl.equalsIgnoreCase(requiredUrl))
					{
					  System.out.println("Test case pass");	
					}
					else
					{
					  System.out.println("Test case fail");	
					}
					}
					catch(Exception e) 
					{
						outputParameters.put("STATUS", "FAIL");
						outputParameters.put("MESSAGE", "methodUsed:validateLogin, InputGiven: "+inputParameters[0].toString());	
						}
					return outputParameters;
				}
		
	
		
		
		
	
	
	
	
	
	
	
	
	
	
	
}
