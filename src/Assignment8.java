import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\Users\\\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.findElement(By.id("autocomplete")).sendKeys("ind");
    Thread.sleep(3000L);
    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
    System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
   
	}

}
