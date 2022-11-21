import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Manish\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		
		// Move to specific element
		//a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();

		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	//	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav-link-accountList']")));
		//Thread.sleep(5);
		a.moveToElement(move).contextClick().build().perform();
		
		
		
	}
	

}
