package takesScreenShot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificElement {

	public static void main(String[] arg) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		TakesScreenshot tc=(TakesScreenshot)driver;
		File sourcFile=tc.getScreenshotAs(OutputType.FILE);
		//File targetfile=new File(System.getProperty("user.dri")+"\\Screenshot\\imag.png");
		File targetfile=new File("C:\\Users\\KIRAN\\Desktop\\Automation Learning\\TakesScreenshot\\img.png");
		sourcFile.renameTo(targetfile);

		
		WebElement img=driver.findElement(By.xpath("//*[@class='card-img-top img-fluid']"));
		File secfiScreenshot=img.getScreenshotAs(OutputType.FILE);
		File targetfileN=new File("C:\\Users\\KIRAN\\Desktop\\Automation Learning\\TakesScreenshot\\img.png");
		secfiScreenshot.renameTo(targetfileN);
		
		driver.quit();
		
	}
}
