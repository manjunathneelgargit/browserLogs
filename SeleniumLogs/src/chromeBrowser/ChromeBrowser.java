package chromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.logfile","./logs/ChromeLogs.txt");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);

	}

}
