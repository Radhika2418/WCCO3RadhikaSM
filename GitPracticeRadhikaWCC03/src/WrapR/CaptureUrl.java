package WrapR;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.lloydsbank.com");
		String UrlOfthePage = driver.getCurrentUrl();
		System.out.println(UrlOfthePage);
		
		driver.get("https://uk.burberry.com");
		String UrlofThePage = driver.getCurrentUrl();
		System.out.println(UrlofThePage);
		
		driver.get("https://www.boots.com");
		String UrlofthePage = driver.getCurrentUrl();
		System.out.println(UrlofthePage);

	}

}

	