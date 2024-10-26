package week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		
		//Enter the CompanyName Field Using Xpath.
		WebElement companyName=driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		companyName.sendKeys("TestLeaf");
		
		//Enter the FirstName Field Using Xpath.
		WebElement firstName= driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		firstName.sendKeys("PV");
		
		//Enter the LastName Field Using Xpath.
		WebElement lasttName=driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lasttName.sendKeys("Prim");
		
		//Enter the FirstName (Local) Field Using Xpath.
		WebElement localName=driver.findElement(By.xpath("//input[@name='firstNameLocal']"));
		localName.sendKeys("localName");
		
		//Enter the Department Field Using any Locator of Your Choice.
		WebElement Department=driver.findElement(By.name("departmentName"));
		Department.sendKeys("Testing Department");
		
		//Enter the Description Field Using any Locator of your choice.
		WebElement Description=driver.findElement(By.name("description"));
		Description.sendKeys("TestLeaf Testing Department");
		
		//Enter your email in the E-mail address Field using the locator of your choice.
		WebElement email=driver.findElement(By.id("createLeadForm_primaryEmail"));
		email.sendKeys("Pv@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text.
		WebElement state=driver.findElement(By.name("generalStateProvinceGeoId"));
		//state.click();
		Select selectTexas=new Select(state);
		selectTexas.selectByVisibleText("New York");
		
		//Click on the Create Button.
		WebElement createLeadButton=driver.findElement(By.className("smallSubmit"));
    	createLeadButton.click();
    	
    	//Click on the edit button.
    	WebElement editButton=driver.findElement(By.linkText("Edit"));
    	editButton.click();
    	
    	//Clear the Description Field.
    	WebElement clearDescription=driver.findElement(By.id("updateLeadForm_description"));
    	clearDescription.clear();
    	
    	//Fill the Important Note Field with Any text.
    	driver.findElement(By.name("importantNote")).sendKeys("Type Here Important Notes");
    	
    	//Click on the update button.
		driver.findElement(By.name("submitButton")).click();
		
		//Get the Title of the Resulting Page.
		String title = driver.getTitle();
		System.out.println("Title of the page:"+title);
		
		
		driver.close();
		
	}

}
