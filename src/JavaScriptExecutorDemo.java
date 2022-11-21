import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//scrolling is not handled by selenium , it is handled by javaScript 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//window level 
		js.executeScript("window.scrollBy(0,550)");

		// table or component level  - it is handled by dom 
		
		Thread.sleep(3000);
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop = 5000");
		
	List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
	int sum =0;
	for(int i=0;i<values.size();i++)
		
	{
	sum = sum+Integer.parseInt(values.get(i).getText());
	}
	
	System.out.println(sum);
	
	int total = Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim());
	Assert.assertEquals(sum, total);
	
	
	List<WebElement> Values2 =driver.findElements(By.xpath("//table[@name='courses']//td[3]"));
	int sum2 = 0;
	for(int i=0;i<Values2.size();i++)
	{
		sum2 = sum2 + Integer.parseInt(Values2.get(i).getText());
	}
	System.out.println(sum2);
	}
       
	
	
}
