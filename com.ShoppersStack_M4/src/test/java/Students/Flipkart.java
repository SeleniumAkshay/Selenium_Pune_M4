package Students;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
//		driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
//		WebElement ele = driver.findElement(By.xpath("(//div[@class='PYKUdo'])[1]"));
//		WebElement ele1 = driver.findElement(By.xpath("(//div[@class='PYKUdo'])[2]"));
//		
		
		WebElement ele = driver.findElement(By.id("box3"));
		WebElement ele1 = driver.findElement(By.id("box103"));
		
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		
		act.clickAndHold(ele).pause(Duration.ofSeconds(3)).release(ele1).perform();
//		act.dragAndDropBy(ele, 100, 0).perform();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
