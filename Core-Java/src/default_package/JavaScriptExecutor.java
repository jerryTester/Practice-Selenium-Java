package default_package;
import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue.WaitStrategy;

import org.openqa.selenium.JavascriptExecutor;


public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\ChromeDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		
		js.executeScript("window.scrollBy(0,500)");
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		
		List<WebElement> td4 = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int values = 0;
		
		for (int i = 0; i < td4.size(); i++) {
			
		values =  values + Integer.parseInt(td4.get(i).getText());
		
	}
		
		System.out.println(values);
		
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		assertEquals(values, total);
		
	}

}
