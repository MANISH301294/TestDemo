
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Ecommerce {

	
	
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
		
		
String[] itemsNeeded = {"Brocolli","Cucumber","Brinjal","Beans"};
		
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(5000);
		
		addItems(driver,itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//explicit wait 
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
	}

	

	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
		int j =0;
List<WebElement>products =driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
			
		{
			// it return Brocolli - 1 kg 
			//for split it or trim it 
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			// convert array to arraylist
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				// after adding the cart it break the loop 
				if(j==itemsNeeded.length)
					break;
			}
			
			
		}

	}

}
