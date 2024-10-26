package week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

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
accName.sendKeys("Camino Dena");

//Enter a description  
WebElement description=driver.findElement(By.name("description"));
description.sendKeys("Selenium Automation Tester.");

//Enter a Number Of Employees
WebElement numOfEmp=driver.findElement(By.name("numberEmployees"));
numOfEmp.sendKeys("12");

//Enter a Site Name 
WebElement siteName=driver.findElement(By.id("officeSiteName"));
siteName.sendKeys("LeafTaps");

//Click the "Create Account" button.
WebElement createAccountButton=driver.findElement(By.className("smallSubmit"));
createAccountButton.click();

//get title
String title=driver.getTitle();
System.out.println("Title Of The Page : "+ title);
driver.close();
	}

}
