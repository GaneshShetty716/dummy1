package demotest.sampletest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class testmaventry {
	

		
		static WebElement ele;
		public static WebDriver d;
		static Select sel;
		
		@Test
		public  static void launchbrower()
		{
			System.setProperty("webdriver.chrome.driver","D:\\Java work space\\chromedriver.exe"  );
			d=new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
			d.get("http://automationpractice.com/index.php");
		}

}
