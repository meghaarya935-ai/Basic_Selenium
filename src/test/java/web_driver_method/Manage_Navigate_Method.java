package web_driver_method;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Navigate_Method {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		Navigation nav = driver.navigate();

		nav.to("https://web.whatsapp.com/");

		Thread.sleep(2000);

		URL url = new URL("https://chatgpt.com/");

		nav.to(url);

		Thread.sleep(2000);
		nav.back();

		Thread.sleep(2000);

		nav.forward();
		Thread.sleep(2000);
		nav.refresh();

		driver.quit();
	}

}
