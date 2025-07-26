package selenium_WebDriver11May;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LuchBrowser {
	public static void main(String[] arg) {
		// Lunch browser
		WebDriver driver=new ChromeDriver();
		//Open URL
		driver.get("https://www.demoblaze.com/");
		//get Title
		String act_title=driver.getTitle();
		if(act_title.equals("STORE")) {
			System.out.println("Title is matching with expected");
		}
		else {
			System.out.println("Title is different with expected");
		}
		driver.quit();	
	}

}
