package week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		
		//Select 'Your most favourite browser' from the radio buttons
		WebElement favrtBrowser= driver.findElement(By.xpath("(//label[text()='Chrome'])[1]"));
		favrtBrowser.click();
		
		//Click on a radio button, then click on the same radio button again to verify that 
		//it becomes ‘unselected’.
		WebElement val=driver.findElement(By.xpath("//label[text()='Bengaluru']"));
		val.click();
		val.click();
		boolean result=val.isSelected();
		if(result == false) {
			System.out.println("This button is Unselected");
		}else {
			System.out.println("This button is selected");
		}
		
		//Identify the radio button that is initially selected by default.
		WebElement whichOne=driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		boolean selectOrNot=whichOne.isEnabled();
		if(selectOrNot) {
			System.out.println("safari is selected");
		}else {
			System.out.println("nothing one is selected");
		}
		
		//Check and select the age group (21-40 Years) if not already selected.
		WebElement isAgeSelected=driver.findElement(By.xpath("//label[text()='21-40 Years']"));
		boolean ageSelect=isAgeSelected.isSelected();
		if(ageSelect == true) {
			driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
		}else {
			System.out.println("21-40 Years is selected");
		}	
	}

}
