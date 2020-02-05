package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		
  }
  @BeforeTest
  public void b1()
  {
	  System.setProperty("webdriver.chrome.driver","D:\\\\chromedriver.exe");
	  driver=new ChromeDriver();
  }
  @AfterTest
  public void b2()
  {
	  driver.close();
  }
  
  
}
