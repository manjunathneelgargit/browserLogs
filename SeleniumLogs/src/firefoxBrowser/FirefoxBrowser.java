package firefoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"./logs/FirefoxLogs.txt");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);
	}
}
