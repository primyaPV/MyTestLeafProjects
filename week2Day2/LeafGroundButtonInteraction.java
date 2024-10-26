package week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButtonInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		//Click on the button with the text ‘Click and Confirm title.’ 
		WebElement clickButt= driver.findElement(By.name("j_idt88:j_idt90"));
		clickButt.click();
		
		//get title
		String getTitle = driver.getTitle();
		
		//Verify that the title of the page is ‘dashBoard.’
		if(getTitle.equals("Dashboard")) {
			System.out.println("The page Title is "+getTitle);
		}else {
			System.out.println("error");
	
		}
		
		driver.navigate().back();
		
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		WebElement disabledButton= driver.findElement(By.name("j_idt88:j_idt92"));
		boolean disableButt=disabledButton.isEnabled();
		
		if(disableButt == false) {
			System.out.println("the button is dissabled");
		}else{
			System.out.println("the button is enabled");
			}
		
		//Find and print the position of the button with the text ‘Submit.’
		Point location=driver.findElement(By.id("j_idt88:j_idt94")).getLocation();
		System.out.println("location"+location);
		
		
		//Find and print the background color of the button with the text ‘Find the Save button color.’ 
		WebElement findColor=driver.findElement(By.id("j_idt88:j_idt96"));
		String color=findColor.getCssValue("background-color");
		System.out.println("Save button color "+color);
		
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’
		Dimension sizeOfButton=driver.findElement(By.name("j_idt88:j_idt98")).getSize();
		int height=sizeOfButton.height;
		int width=sizeOfButton.width;
		System.out.println("height : "+height );
		System.out.println( "width : "+width);
		
		//close the window
		driver.close();
		
		
		
		
	}

}
