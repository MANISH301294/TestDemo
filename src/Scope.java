import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//1. for finding the link on the webpage 
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. for finding the link on particular section of web page 
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3. for finding the link of only one column in particular section 
		
		WebElement Columndriver = footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
		System.out.println(Columndriver.findElements(By.tagName("a")).size());
		
		//4. click on each link on the coloumn and check if the pages are opening 
		
		for(int i=1;i<Columndriver.findElements(By.tagName("a")).size();i++)
		{
			String ClickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			 Columndriver.findElements(By.tagName("a")).get(i).sendKeys(ClickonlinkTab);
			 Thread.sleep(5000L);
		}
		
		// 5.Getting the title of child tabs with optimized while loop
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it  = abc.iterator();
		while(it.hasNext()) //hasNext method used for checking the next tab is present or not 
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}

}
