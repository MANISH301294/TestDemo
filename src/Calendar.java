import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Manish\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.oyorooms.com/");
		Thread.sleep(3000L);
		String month = "November";
	    driver.findElement(By.xpath("//div[@class='oyo-cell oyo-cell--12-col oyo-cell--8-col-tablet oyo-cell--4-col-phone d-text16 is-fontBold datePickerDesktop__checkInOut u-textEllipsis']")).click();
	
		//select the month 
	  /*  Actions a = new Actions(driver);
	   
	
		while(! a.moveToElement(driver.findElement(By.xpath("(//div[@class='DateRangePicker__MonthHeader'])[1]"))).build().equals(month));
		{
			driver.findElement(By.xpath("//div[@class='DateRangePicker__PaginationArrow DateRangePicker__PaginationArrow--next']")).click();
		}
		
		*/
		// Selecting the Dates 
		
	    List<WebElement>  dates = driver.findElements(By.cssSelector(".DateRangePicker__Date"));
	      
	      for(int i =0;i<dates.size() ;i++)
	      {
	    	  String text = driver.findElements(By.cssSelector(".DateRangePicker__Date")).get(i).getText();
	    	  
	    	  if(text.equalsIgnoreCase("23"))
	    	  {
	    		  driver.findElements(By.cssSelector(".DateRangePicker__Date")).get(i).click();
	    		  break;
	    	  }
	      }
		
	}
}
