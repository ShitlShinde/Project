package utility;

public class Calling
{
	
public static void main(String[] args) throws InterruptedException
{
	       //brawserLaunch
	       Object[]input=new Object[2];
			input[0]="webdriver.chrome.driver";
			input[1]="F:\\Automation Support\\chromedriver.exe";
			SeleniumOperations.brawserLaunch(input);

			//openApplication
			Object[]input1=new Object[1];
			input1[0]="https://www.flipkart.com/";
			SeleniumOperations.openApplication(input1);
			
			//clickOnCancel
			Object[]input2=new Object[1];
			input2[0]="//*[@class='_2KpZ6l _2doB4z']";
			SeleniumOperations.clickOnElement(input2);
		
			//mouseOver
			Object[]input3=new Object[1];
			input3[0]="//*[text()='Login']";
			SeleniumOperations.mouseOver(input3);
			
			//click on my profile
			Object[]input4=new Object[1];
			input4[0]="My Profile";
			SeleniumOperations.clickByLinkText(input4);
			
			Thread.sleep(2000);
			
			//enter mobile number
			Object[]input5=new Object[2];
			input5[0]="(//*[@type='text'])[2]";
			input5[1]="8308440478";
			SeleniumOperations.sendKeys(input5);	
			
			//enter password
			Object[]input6=new Object[2];
			input6[0]="//*[@type='password']";
			input6[1]="pa$$w0rd";
			SeleniumOperations.sendKeys(input6);	
			
			//click on login
			Object[]input7=new Object[1];
			input7[0]="(//*[@type='submit'])[2]";
			SeleniumOperations.clickOnElement(input7);	
			
			Thread.sleep(2000);
			
			//click on Manage Addresses
			Object[]input8=new Object[1];
			input8[0]="(//*[@class='NS64GK'])[1]";
			SeleniumOperations.clickOnElement(input8);	
			
			Thread.sleep(2000);
			
			//click on add a new Addresses
			Object[]input9=new Object[1];
			input9[0]="//*[@class='_1QhEVk']";
			SeleniumOperations.clickOnElement(input9);	
			
			//enter name
			Object[]input10=new Object[2];
			input10[0]="//*[@name='name']";
			input10[1]="Shital";
			SeleniumOperations.sendKeys(input10);	
			
			//enter mobile number
			Object[]input11=new Object[2];
			input11[0]="//*[@name='phone']";
			input11[1]="8308440478";
			SeleniumOperations.sendKeys(input11);	
			
			//enter pincode
			Object[]input12=new Object[2];
			input12[0]="//*[@name='pincode']";
			input12[1]="423604";
			SeleniumOperations.sendKeys(input12);	
			
			//enter locality
			Object[]input13=new Object[2];
			input13[0]="//*[@name='addressLine2']";
			input13[1]="Chas(nali)";
			SeleniumOperations.sendKeys(input13);	
			
			//enter Address
			Object[]input14=new Object[2];
			input14[0]="//*[@name='addressLine1']";
			input14[1]="Chas(nali),Kopargaon";
			SeleniumOperations.sendKeys(input14);	
			
			//click on home
			Object[]input15=new Object[1];
			input15[0]="(//*[@class='_1XFPmK'])[1]";
			SeleniumOperations.clickOnElement(input15);	
			
			//click on save
			Object[]input16=new Object[1];
			input16[0]="(//*[@type='button'])[2]";
			SeleniumOperations.clickOnElement(input16);	
			
			
			



			

			
			
			
			
			
			
			

			
			


			
	
	
	
	
	
	
	
}
}
