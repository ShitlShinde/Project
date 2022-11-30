package cucumbermap;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;
import java.util.Hashtable;

public class Login 
{
	@When ("^user provide \"(.*)\" and exe location as \"(.*)\"$")
	      public void bLaunch(String key, String exe)
	      {
		     Object[]input=new Object[2];
		     input[0]=key;
		     input[1]=exe;
		     Hastable<String,Object> output=SeleniumOperations.brawserLaunch(input);
		     
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user provide \"(.*)\" and exe location as \"(.*)\"$", output.get("MESSAGE").toString());
	      }
	
	@When ("^user provide url as \"(.*)\"$")
	      public void openApp(String url)
	      {
		    Object[]input1=new Object[1];
		    input1[0]=url;
		    Hashtable<String,Object> output1=SeleniumOperations.openApplication(input1);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"^user provide url as \"(.*)\"$" , output.get("MESSAGE").toString());
	      }
	   

	@When ("^user cancel initial login page$")
	      public void cancel()
	      {
		    Object[]input2=new Object[1];
		    input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		    Hashtable<String,Object> output2=SeleniumOperations.clickOnElement(input2);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"^user cancel initial login page$" , output.get("MESSAGE").toString());

	      }
	
	@When ("^user navigate on Login$")
	      public void nav_login()
	      {
		   Object[]input3=new Object[1];
		   input3[0]="//*[text()='Login']";
		   Hashtable<String,Object> output3=SeleniumOperations.mouseOver(input3);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"^user navigate on Login$" , output.get("MESSAGE").toString());
	      }
	
	@When ("^user click on My Profile$")
	      public void clickOnMyPro() throws InterruptedException
	      {
		   Object[]input4=new Object[1];
		   input4[0]="My Profile";
		   Hashtable<String,Object> output4=SeleniumOperations.clickByLinkText(input4);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"^user click on My Profile$", output.get("MESSAGE").toString());

		   Thread.sleep(2000);
	      }
	
	@When ("^user enter (.+) as username$")
	      public void enterUsername(String uname) throws InterruptedException
	      {
		   Object[]input5=new Object[2];
		   input5[0]="(//*[@type='text'])[2]";
		   input5[1]=uname;
		   Hashtable<String,Object> output5=SeleniumOperations.sendKeys(input5);
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"^user enter (.+) as username$", output.get("MESSAGE").toString());

		   Thread.sleep(2000);
	      }
	
	@When ("^user enter (.+) as password$")
	      public void enterPassword(String pass)
	      {
		   Object[]input6=new Object[2];
		   input6[0]="//*[@type='password']";
		   input6[1]=pass;
		   Hashtable<String,Object> output6=SeleniumOperations.sendKeys(input6);	
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"^user enter (.+) as password$", output.get("MESSAGE").toString());
		   
	       }
	
	
	@When ("^user click on Login button$")
	      public void click_Login()
	      {
		   Object[]input7=new Object[1];
		   input7[0]="(//*[@type='submit'])[2]";
		   Hashtable<String,Object> output7=SeleniumOperations.clickOnElement(input7);	
		   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"^user click on Login button$", output.get("MESSAGE").toString());

	      }


	@Then ("^application shows user profile to user$")
	       public void show_user_profile()
	       {
		    Object[]input8=new Object[1];
		    input8[0]="https://www.flipkart.com/account/?rd=0&link=home_account";
		    Hashtable<String,Object> output8=SeleniumOperations.validateLogin(input8);
		    HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"^application shows user profile to user$", output.get("MESSAGE").toString());

		    
	       }

	
	
	
	
	
	
	
	
}
