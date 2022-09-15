package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelMethod {
	WebDriver driver;
	long startTime;
	long endTime;
	@Test
	public void launchBrowser() throws InterruptedException {
				
		startTime=System.currentTimeMillis();
		Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sridh\\eclipse-workspace\\SeleniumPractice\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.mandmdirect.com/");
		Thread.sleep(2000);
		driver.quit();
}
	public void launchBrowse() throws InterruptedException {
		
		startTime=System.currentTimeMillis();
		Thread.sleep(2000);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sridh\\eclipse-workspace\\SeleniumPractice\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.mandmdirect.com/");
		Thread.sleep(2000);
		driver.quit();
}
}
