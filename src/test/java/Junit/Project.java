package Junit;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import DataDriven.BaseClass;
import Pojo.LoginPojo;

public class Project extends BaseClass {
	@BeforeClass
	public static void browserLaunch() {
		launchChrome();
		WinMax();
	}
	@AfterClass
	public static void browserClose() {
		closeBrowser();
	}
	@Before
	public void startTime() throws InterruptedException {
		loadUrl("https://www.mandmdirect.com");
		Date d= new Date();
		System.out.println(d);
		Thread.sleep(3000);
		LoginPojo l = new LoginPojo();
		WebElement signbtn = l.getSignBtn();
		btnClick(signbtn);
		Thread.sleep(2000);
	}
	@After
	public void endTime() {
		Date d= new Date();
		System.out.println(d);
	}
	@Test
	public void tc1() throws IOException, InterruptedException {
		LoginPojo l=new LoginPojo();
		fill(l.getTxtUser(), getData(0,0));
		fill(l.getTxtPass(), getData(0,1));
		btnClick(l.getBtnLogin());
		Thread.sleep(3000);
	}
	@Test
	public void tc3() throws IOException, InterruptedException {
		LoginPojo l=new LoginPojo();
		fill(l.getTxtUser(), getData(1,0));
		fill(l.getTxtPass(), getData(1,1));
		btnClick(l.getBtnLogin());
		Thread.sleep(3000);
	}
	@Test
	public void tc2() throws IOException, InterruptedException {
		LoginPojo l=new LoginPojo();
		fill(l.getTxtUser(), getData(2,0));
		fill(l.getTxtPass(), getData(2,1));
		btnClick(l.getBtnLogin());
		Thread.sleep(3000);
	}
}
