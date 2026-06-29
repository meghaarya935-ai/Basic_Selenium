package web_driver_method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_WebDriver_Methods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");   // open url 

		String extitle = "Facebook";  			// get title
		String acttitle = driver.getTitle();
		if(acttitle.contains(extitle));
		System.out.println("title matched");
		
//		String url= driver.getPageSource();		// get page source code
//		System.out.println(url);
	
		String curl = driver.getCurrentUrl();	//get url
		System.out.println(curl);

		driver.manage().window().maximize();	// window maximize
		Thread.sleep(2000);
		driver.manage().window().minimize();    // window minimize
		Thread.sleep(2000);
		driver.manage().window().fullscreen(); //  fullscreen 
		Thread.sleep(2000);

		Window win = driver.manage().window();  // get size
		Dimension dim = win.getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();

		System.out.println(dim);         
		System.out.println(height);
		System.out.println(width);
		Thread.sleep(2000);

		Dimension dim2 = new Dimension(400, 600);  //set size
		win.setSize(dim2);

		Point p1 = win.getPosition();     //get position
		int x = p1.getX(); 
		int y = p1.getY();
		System.out.println(p1);
		System.out.println(x);
		System.out.println(y);

		Point p2 = new Point(300, 500);  //set position
		win.setPosition(p2);
		driver.quit();

	}

}
