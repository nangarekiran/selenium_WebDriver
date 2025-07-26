package selenium_WebDriver11May;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Locator {
	public static void main(String[] arg) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		//boolean status=driver.findElement(By.className("carousel-item")).isDisplayed();
		//System.out.println(" status of the imagae "+status);
		
		driver.findElement(By.partialLinkText("Hom")).click();
		System.out.println(" working fine");
		//headerlinks find
	List<WebElement> headerlinks=driver.findElements(By.className("nav-item"));
		System.out.println(headerlinks.size());
		// all image present 
		List<WebElement>image=driver.findElements(By.tagName("img"));
		System.out.println("Total image on web page " +image.size());
		driver.quit();
	}
}
