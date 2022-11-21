import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.getTitle();
		driver.getCurrentUrl();
		//For selecting  from and To 
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'][11]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1g40b8q']//div[@data-testid='to-testID-origin']")).getText());
		Thread.sleep(2000L);
		 driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-19yat4t r-1rt2jqs']//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73'][4]")).click();
		 System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1g40b8q']//div[@data-testid='to-testID-destination']")).getText());

		 // Selecting the date 
		 
		 driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']")).click();
		 
		 // checking the return calendar is disable or not
		 
		 if(driver.findElement(By.xpath("//div[@style='font-family: inherit; opacity: 0.5;']")).getAttribute("style").contains("0.5"))
		 {
		 
		       System.out.println("its disabled");
		       Assert.assertTrue(true);
		       
			}
		 else
		 {
			 Assert.assertTrue(false);
	}
		 // Increasing the no. of passenger 
		 
		 driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
		 for(int i=1;i<4;i++)
		    {
	       driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		    }
		  driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-obd0qt r-k8qxaj r-d9fdf6']//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		  
		 //checkbox
		 
		 driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa']")).click();
		 Thread.sleep(5000);
		 
		 //submit button 
		 driver.findElement(By.xpath("//div[(text()='Search Flight')]")).click();

}}
