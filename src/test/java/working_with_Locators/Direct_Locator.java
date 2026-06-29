package working_with_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Direct_Locator {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/?hl=en");

		driver.manage().window().maximize();

		WebElement Username = driver.findElement(By.name("email"));
		Username.sendKeys("MeghaArya");

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Megha@123");
		Thread.sleep(4000);

//		 WebElement links= driver.findElement(By.className("x193iq5w"));  
//		 links.click();

//	  WebElement links =  driver.findElement(By.linkText("Forgot password?"));
//	  links.click();

//	    WebElement parlinks=driver.findElement(By.partialLinkText("C"));
//	    parlinks.click();

		WebElement name = driver.findElement(By.className("x1ja2u2z"));
		System.out.println(name.getTagName());

//		List<WebElement> tg = driver.findElements(By.tagName("div"));
//		int totaltg = tg.size();
//		System.out.println(totaltg);

		Thread.sleep(4000);
		driver.quit();  // this quit bowser

	}

}
