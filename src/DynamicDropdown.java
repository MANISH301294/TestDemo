import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver","C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.spicejet.com/");
 driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1g40b8q']//div[@data-testid='to-testID-origin']")).click();
 driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'][11]")).click();
 System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1g40b8q']//div[@data-testid='to-testID-origin']")).getText());
 Thread.sleep(2000L);
 driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs']//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'][4]")).click();
 System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1g40b8q']//div[@data-testid='to-testID-destination']")).getText());
 
 // Select the current date 
 
 driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']")).click();
 
 // for enable and disable element 
 
// System.out.println(driver.findElement(By.xpath("//div[@style='font-family: inherit; opacity: 0.5;']")).isEnabled());
 System.out.println(driver.findElement(By.xpath("//div[@style='font-family: inherit; opacity: 0.5;']")).getAttribute("style"));
 driver.findElement(By.xpath("//div[@style='font-family: inherit; opacity: 0.5;']")).click();
 System.out.println(driver.findElement(By.xpath("//div[@style='font-family: inherit; opacity: 1;']")).getAttribute("style"));
 if(driver.findElement(By.xpath("//div[@style='font-family: inherit; opacity: 1;']")).getAttribute("style").contains("1"))
 {
 
       System.out.println("its enabled");
       Assert.assertTrue(true);
       
	}
 else
 {
	 Assert.assertTrue(false);
 }
}
}
