import org.openqa.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class HomePage {
	
	public void launchBrowser() {
		WebDriver  driver = new SafariDriver();
		driver.get("http://www.imdb.com/chart/top");
		
		
	}

}
