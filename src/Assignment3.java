import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment3 {
@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String[] ItemsList = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Staticdropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		
		String name = Username(driver);
		String pass = Containt(driver);
		
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(pass);
		
		WebElement radio = driver.findElement(By.xpath("//input[@value='user']"));
	    radio.click();
		
		//driver.findElement(By.id("usertype")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(null))
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		//driver.findElement(By.xpath("//select[@class='form-control']")).click();
		//driver.findElement(By.xpath("//option[@value='stud']")).click();
		
		Select dropdown = new Select(Staticdropdown);
		dropdown.selectByVisibleText("Student");
		
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
	}
	
	public static  String Username(WebDriver driver)
		
	{
		String PasswordText = driver.findElement(By.xpath("//p[@class='text-center text-white']")).getText();
		String[] PasswordArray = PasswordText.split("and");
		String[] PasswordArray2 = PasswordArray[0].split("is");
		String Username = PasswordArray2[1];
		return Username;
		
		}
	
	public static  String Containt(WebDriver driver)
	
	{
		
	String PasswordText = driver.findElement(By.xpath("//p[@class='text-center text-white']")).getText();
	String[] PasswordArray = PasswordText.split("and");
	String[] PasswordArray3 = PasswordArray[1].split("is");
	String Password = PasswordArray3[1];
	return Password;
	}
		
	
		
	}


