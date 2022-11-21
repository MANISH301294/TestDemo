import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
		System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
		driver.manage().window().maximize();
		System.out.println("hello 1");
		System.out.println("hello 2");
		System.out.println("hello 2");
		System.out.println("hello 2");
		

	}

}
