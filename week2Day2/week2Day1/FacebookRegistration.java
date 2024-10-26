package week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();

// Load the URL https://en-gb.facebook.com/ 
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();

//Click on the Create new account button. 
WebElement createButton=driver.findElement(By.linkText("Create new account"));
createButton.click();

//Enter the First name.
WebElement firstName= driver.findElement(By.name("firstname"));
firstName.sendKeys("dena");

//Enter the Surname. 
WebElement Surname= driver.findElement(By.name("lastname"));
Surname.sendKeys("camino");

//Enter the Mobile number or email address. 
WebElement mail= driver.findElement(By.name("reg_email__"));
mail.sendKeys("pv@gmail.com");

//Enter the New password. 
WebElement newPass= driver.findElement(By.name("reg_passwd__"));
newPass.sendKeys("123123123");

//Date Of Birth
WebElement Date=driver.findElement(By.name("birthday_day"));
Select selectDate=new Select(Date);
selectDate.selectByVisibleText("17");

WebElement Month=driver.findElement(By.name("birthday_month"));
Select selectMonth=new Select(Month);
selectMonth.selectByVisibleText("Aug");

WebElement Year=driver.findElement(By.name("birthday_year"));
Select selectYear=new Select(Year);
selectYear.selectByVisibleText("1998");

//Select the radio button in Gender.
WebElement gender=driver.findElement(By.className("_8esa"));
gender.click();
	}

}
