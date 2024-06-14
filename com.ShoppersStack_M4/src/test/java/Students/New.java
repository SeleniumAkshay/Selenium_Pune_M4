package Students;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com");
		
		driver.switchTo().activeElement().sendKeys("Hello");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.instagram.com");
//		driver.switchTo().newWindow(WindowType.WINDOW);
		
//		Set<String> ids = driver.getWindowHandles();
//		
//		for (String string : ids) {
//			driver.switchTo().window(string);
//		}
		
		driver.get("https://www.instagram.com");
		
		
//		Dimension size = driver.manage().window().getSize();
//		System.out.println(size);		
//		
//		Thread.sleep(2000);
//		Dimension newSize = new Dimension(1200, 1000);
//		driver.manage().window().setSize(newSize);
//		
//		Point position = driver.manage().window().getPosition();
//		System.out.println(position);
//		
//		Thread.sleep(2000);
//		Point newPosition = new Point(510, 11);
//		driver.manage().window().setPosition(newPosition);
		
//		driver.manage().window().minimize();
//		Thread.sleep(2000);
//		driver.manage().window().maximize();
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
