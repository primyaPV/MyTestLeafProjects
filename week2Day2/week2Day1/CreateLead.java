package week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//Load the URL and Maximize the browser window
		driver.get("http://leaftaps.com/opentaps/");
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
		
		//Click on the "Create Account" button.
		WebElement createLead=driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		
		//Enter an first name
		WebElement firstName=driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Aldrin");
		
		//Enter an last name
		WebElement lastName=driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Shinu");
		
		//Enter a CompanyName.
		WebElement companyName=driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("TestLeaf");
		
		//Enter a Title
		WebElement profieTitle=driver.findElement(By.name("generalProfTitle"));
		profieTitle.sendKeys("Test Automation");
		
		//Click the "Create Lead" button.
		WebElement createLeadButton=driver.findElement(By.className("smallSubmit"));
    	createLeadButton.click();
		
		//get title
		String title=driver.getTitle();
		System.out.println("Title Of The Page : "+ title);
		driver.close();
	}

}
