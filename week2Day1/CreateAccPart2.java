package week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccPart2 {
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

//Click on the "Accounts" tab
WebElement AccountTab=driver.findElement(By.linkText("Accounts"));
AccountTab.click();

//Click on the "Create Account" button.
WebElement createAccount=driver.findElement(By.linkText("Create Account"));
createAccount.click();

//Enter an account name
WebElement accName=driver.findElement(By.id("accountName"));
accName.sendKeys("tom mya");

//Enter a description  
WebElement description=driver.findElement(By.name("description"));
description.sendKeys("Selenium Automation Tester.");

//Select "ComputerSoftware" as the industry  
WebElement industry=driver.findElement(By.name("industryEnumId"));
Select select=new Select(industry);
select.selectByVisibleText("Computer Software");

//Select "S-Corporation" as ownership using SelectByVisibleText.
WebElement SCorporation=driver.findElement(By.name("ownershipEnumId"));
Select select1=new Select(SCorporation);
select1.selectByVisibleText("S-Corporation");

//Select "Employee" as the source using SelectByValue.
WebElement Employee=driver.findElement(By.name("dataSourceId"));
Select selectEmp=new Select(Employee);
selectEmp.selectByValue("LEAD_EMPLOYEE");

//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
WebElement marketingCampaign=driver.findElement(By.name("marketingCampaignId"));
Select selecteCommerce=new Select(marketingCampaign);
selecteCommerce.selectByIndex(5);

//Select "Texas" as the state/province using SelectByValue.
WebElement state=driver.findElement(By.name("generalStateProvinceGeoId"));
Select selectTexas=new Select(state);
selectTexas.selectByValue("TX");

//Click the "Create Account" button.
WebElement createAccountButton=driver.findElement(By.className("smallSubmit"));
createAccountButton.click();

//get title
String title=driver.getTitle();
System.out.println("Title Of The Page : "+ title);

//close the window
driver.close();
	}
}
