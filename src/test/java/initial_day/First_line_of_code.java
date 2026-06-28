package initial_day;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First_line_of_code {

	public static void main(String[] args) {
		
		/*
		 * ChromeDriver driver=new ChromeDriver();
		 * 
		 * EdgeDriver driver2 =new EdgeDriver();
		 * 
		 * FirefoxDriver driver3 = new FirefoxDriver();
		 */
		
		// upcasting
		
//		WebDriver driver=new ChromeDriver();
//		WebDriver driver2= new EdgeDriver();
//		WebDriver driver3=new FirefoxDriver();
		
		
		//ploy-morphism
		WebDriver driver=new ChromeDriver();
					driver=new EdgeDriver();
					driver=new FirefoxDriver();

	}

}
