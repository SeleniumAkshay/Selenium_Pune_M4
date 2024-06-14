package Students;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ActionEx {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.justdial.com/");
		
		driver.findElement(By.partialLinkText("Maybe Later")).click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
//		Point location = driver.findElement(By.xpath("//div[text()='EN']")).getLocation();
//		act.moveByOffset(location.getX(), location.getY()).perform();
//		act.moveToLocation(location.getX(), location.getY()).perform();
		
//		act.scrollByAmount(0, 5000).perform();	
		WebElement ele = driver.findElement(By.xpath("//span[text()='Travel Bookings']"));
//		act.scrollToElement(ele).perform();
		
		ScrollOrigin ele1=ScrollOrigin.fromElement(ele);
		
		act.scrollFromOrigin(ele1, 0, 500).perform();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
