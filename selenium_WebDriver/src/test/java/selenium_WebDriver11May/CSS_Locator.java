package selenium_WebDriver11May;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locator {
	public static void main(String[] arg) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		// css selector tagname#id
		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Iphone");
		System.out.println(" iphones searched successfully with help of tagname#id locator");
		// css selector tagname.classname
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Sumsung S24");
		System.out.println(" iphones searched successfully by tagname.Classname locator");
		
		// css selector tagname attribute
		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("attribute");
		System.out.println(" iphones searched successfully with help of tagname attribute");
		
		// css selector tagname#id
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Iphone");
		System.out.println(" iphones searched successfully");
		driver.quit();
	}
}
