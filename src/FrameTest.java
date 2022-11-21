import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		// findout how many frames on page 
				System.out.println(driver.findElements(By.tagName("iframe")).size());
		// switch to frame by webelement 
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
				//switch to frame by index 
				driver.switchTo().frame(0);
				
		// performing drag and drop 
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		
		//return back to webpage from frame 
		driver.switchTo().defaultContent();
		
		
	}

}
