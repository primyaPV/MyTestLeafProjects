package week3Day2Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioWebsite {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.ajio.com/");
        driver.manage().window().maximize();
        
        WebElement search= driver.findElement(By.name("searchVal"));
        search.sendKeys("Bags");
        
        driver.findElement(By.xpath("//span[@class='ic-search']")).click();
        driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
        
        //get count
        Thread.sleep(3000);
        WebElement getCount=driver.findElement(By.xpath("//div[@class='length']"));
        System.out.println(" total count of bags : "+getCount.getText());
        Thread.sleep(3000);
        
        List<WebElement> brand=driver.findElements(By.xpath("//div[@class='brand']//strong"));
        System.out.println("total count of Brands : "+brand.size());
        System.out.println("==============Brand Name============");
       for (WebElement Brand : brand) {
			String brandName=Brand.getText();
			System.out.println(brandName);
			
		}
       
       
       List<WebElement> Bags=driver.findElements(By.xpath("//div[@class='nameCls']"));
       System.out.println("total count of bags : "+Bags.size());
       System.out.println("==============Bags Name============");
      for (WebElement Bag : Bags) {
			String bagsName=Bag.getText();
			System.out.println(bagsName);
			
		}
       driver.close();
       
	}

}
