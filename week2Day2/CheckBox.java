package week2Day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();

		//Load the URL and Maximize the browser window
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		//Click on the "Basic CheckBox”.
		WebElement basicCheckBox=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt89']/div[2]"));
		basicCheckBox.click();
		
		// Click on the "Notification CheckBox."
		WebElement notification=driver.findElement(By.xpath("//span[text()='Ajax']/parent::div//div[2]"));
		notification.click();
		
		
		Thread.sleep(1000);
		//Verify that the expected message is displayed.
		WebElement notify=driver.findElement(By.xpath("//span[text()='Checked']"));
		String checkedOrNot=notify.getText();
		if(checkedOrNot.equals("Checked")) {
			System.out.println("Notification Check box is Checked");
		}else {
			System.out.println("Notification Check box is UnChecked");
		}
		
		//Click on your favorite language (assuming it's related to checkBoxes).
		WebElement javaSelect=driver.findElement(By.xpath("//label[text()='Java']"));
		javaSelect.click();
		
		// Click on the "Tri-State CheckBox."
		WebElement StateCheck=driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']"));
		StateCheck.click();
		Thread.sleep(2000);
	
		//Verify which tri-state option has been chosen.
		WebElement stateNotify = driver.findElement(By.xpath("//p[text()='State = 1']"));
		String stateVal = stateNotify.getText();
		System.out.println("tri-state option is "+stateVal);
		
		//Click on the "Toggle Switch."
		WebElement Toggle = driver.findElement(By.className("ui-toggleswitch-slider"));
		Toggle.click();
		Thread.sleep(1000);
		
		//Verify that the expected message is displayed.
		WebElement checked=driver.findElement(By.xpath("//span[text()='Checked']"));
		String ifChecked=checked.getText();
		if(ifChecked.equals("Checked")) {
			System.out.println("Toggle Switch is Checked");
		}else {
			System.out.println("Toggle Switch is UnChecked");
		}
		
		//Verify if the CheckBox is disabled.
		WebElement disable=driver.findElement(By.name("j_idt87:j_idt102_input"));
		boolean test =disable.isEnabled();
		if(test == false) {
			System.out.println("CheckBox is disabled");
		}else {
			System.out.println("CheckBox is enable");
		}
		
		//Select multiple options on the page (details may be needed).
		WebElement cities=driver.findElement(By.xpath("//ul[@data-label='Cities']"));
		cities.click();
	    driver.findElement(By.xpath("//li[@data-item-value='Miami']//div[2]")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Paris']//div[2]")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Istanbul']//div[2]")).click();
		
		WebElement body = driver.findElement(By.xpath("//body")); 
        body.click();
        
        driver.close();
		
	}
		

	
		
	}


