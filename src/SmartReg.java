import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;






public class SmartReg {
	
	
	WebDriver driver = new ChromeDriver();
	String myWeb = "https://smartbuy-me.com/smartbuystore/en/login";
 
	
	
	@BeforeTest
	public void SmartBuyRegeister() {
		
		driver.manage().window().maximize();

	}

	@Test(invocationCount = 8)
	public void Myemail() throws InterruptedException {
	
		
		
		driver.get(myWeb);

		String Firstname ="Sarah";
		String lastName ="jadallah";
		String Domain ="@gmail.com";

		Random Rand= new Random();
		int randomMax = Rand.nextInt(10);
		WebElement MyEmail = driver.findElement(By.id("register.email"));
		Thread.sleep(2000);
		MyEmail.sendKeys(Firstname.concat(lastName)+randomMax+Domain);

		
		
		
	}
	
	
	
	
	
	
	
	

}
