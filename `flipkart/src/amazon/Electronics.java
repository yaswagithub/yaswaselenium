package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Electronics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
WebDriver driver = new ChromeDriver();
 driver.get("https://www.amazon.in/ref=nav_logo");
WebElement homedrop = driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']"));
select category = new 


 
driver.findElement(By.xpath("//input[@value='Go']")).click();
	}

}
