package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import DataDriven.BaseClass;

public class Grouping extends BaseClass{
	WebDriver driver;
	long startTime;
	long endTime;

	@BeforeSuite
	public void launchBrowser() throws InterruptedException {
		startTime=System.currentTimeMillis();
		Thread.sleep(2000);
		launchChrome();
		WinMax();
		Thread.sleep(2000);
	}
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		endTime=System.currentTimeMillis();
		long totalTime= endTime-startTime;
		System.out.println("Total time taken" + totalTime);
	}
	@Test(priority= 1, groups = {"EX 1"})
	public void openGoogle() throws InterruptedException {
		//System.out.println("driver :"+ driver);
		loadUrl("https://www.mandmdirect.com/");
		Thread.sleep(3000);
	}
	@Test(priority= 2, groups = {"EX 1"})
	public void searchProduct() throws InterruptedException {
		WebElement print = driver.findElement(By.xpath("//input[@id='mainSearchText']"));
		print.sendKeys("shoes");
		Thread.sleep(2000);
		WebElement cookiesbtn = driver.findElement(By.xpath("//button[@id='mainSearchBtn']"));
		cookiesbtn.click();
	}
	@Test(priority= 3, groups = {"EX 1"})
	public void searchProducts() throws InterruptedException {
		WebElement print = driver.findElement(By.xpath("//input[@id='mainSearchText']"));
		print.sendKeys("Shirt");
		Thread.sleep(2000);
		WebElement cookiesbtn = driver.findElement(By.xpath("//button[@id='mainSearchBtn']"));
		cookiesbtn.click();
	}
	@Test()
	private void tc4() {
		System.out.println("Test4");
	}
	@Test
	private void tc5() {
		System.out.println("Test5");
	}
	@Test(groups= {"GP"})
	private void tc6() {
		System.out.println("Test6");
	}
	
}
