import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RahulShettyPas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully Login");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class ='login-container'] h2")).getText(),"Hello" +name+ "'"); 
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
	}
		public static String getPassword(WebDriver driver) throws InterruptedException
		{
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("//button[@class='reset-pwd-btn']")).click();
			
			String passwordText = driver.findElement(By.cssSelector(".infoMsg")).getText();
			
			String[] passwordArray = passwordText.split("'");
			//passwordArray[0] = Please use temporary password
			//passwordArray[1] = rahulshettyacademy' to login

			String[] passwordArray2 = passwordArray[1].split("'");
			String password = passwordArray2[0];
			return password;
			
			
			
			
		}

	}


