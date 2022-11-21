import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdateDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Manish\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.spicejet.com/");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
	    // for increasing the value either we repeat the this script line multiple time or we use loop for automatic increasing it.
	    Assert.assertEquals(driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText(),"1 Adult");
	    System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText());
	    Thread.sleep(2000);
	   /* int i =1;
	  while(i<5)
	  {
	    
	    driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz']//div[@class='r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-1aockid css-1dbjc4n']")).click();
		i++;
	  }
	  */
	    for(int i=1;i<5;i++)
	    {
       driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
	    }
	  driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-obd0qt r-k8qxaj r-d9fdf6']//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
	  Assert.assertEquals(driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText(),"5 Adults");
	  System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText());
	  
	  
	  
	}

}


