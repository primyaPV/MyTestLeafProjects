package week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();

		//Load the URL and Maximize the browser window
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		
		//Enter a userName and password.
		       WebElement userName= driver.findElement(By.id("username"));
				userName.sendKeys("demosalesmanager");

				WebElement PasswordField= driver.findElement(By.name("PASSWORD"));
				PasswordField.sendKeys("crmsfa");

				///Click the "Login" button.
				WebElement loginButton= driver.findElement(By.className("decorativeSubmit"));
				loginButton.click();

				//Click on the "CRM/SFA" link.
				WebElement linkPage= driver.findElement(By.linkText("CRM/SFA"));
				linkPage.click();
				
				//Click on the "Leads" tab.
				WebElement leadsTab=driver.findElement(By.linkText("Leads"));
				leadsTab.click();
				
				//Click "Find leads." 
				WebElement findLead=driver.findElement(By.linkText("Find Leads"));
				findLead.click();
				
				//Click on the "Phone" tab.
				WebElement phone=driver.findElement(By.linkText("Phone"));
				phone.click();
				
				//Enter the phone number.
				WebElement phoneNumber=driver.findElement(By.name("phoneNumber"));
				phoneNumber.sendKeys("681-3029");
				
				//Click the "Find leads" button.
				WebElement findLeadButton=driver.findElement(By.id("ext-gen334"));
				findLeadButton.click();
				Thread.sleep(2000);
				//Capture the lead ID of the first resulting lead.
				WebElement leadId=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
				String lead=leadId.getText();
				System.out.println(lead);
				
				//Click the first resulting lead.
				leadId.click();
				
				//Click the "Delete" button.
     		  WebElement deleteButton=driver.findElement(By.linkText("Delete"));
			  deleteButton.click();
			  
			   //Click "Find leads." 
				driver.findElement(By.linkText("Find Leads")).click();
				
				//Enter the captured lead ID. 
				driver.findElement(By.name("id")).sendKeys(lead);
				
				//Click the "Find leads" button.
				WebElement findLeads=driver.findElement(By.id("ext-gen334"));
				findLeads.click();
				Thread.sleep(2000);
				
				WebElement isData=driver.findElement(By.xpath("//div[@class='x-paging-info']"));
				String result=isData.getText();
				if(result.equals("No records to display")) {
					System.out.println("No records to display");
				}else {
					System.out.println("data was there");
				}
				
				 driver.close();
			  
	}

}
