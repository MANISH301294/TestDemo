import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://preprod21.boutiqaat.com/en-kw/men/");
		
	  System.out.println(driver.getTitle());
	  
	  System.out.println(driver.getCurrentUrl());
	  driver.close();
	}

}
