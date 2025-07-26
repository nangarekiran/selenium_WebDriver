package switchWindow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoWindows {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		System.out.println(" on linked clicked successfully");
		//driver.findElement(By.xpath("//*[text()='Watch on']")).click();
		Set<String>WindID=driver.getWindowHandles();
		/*System.out.println("window id");
		List<String> WindowList=new ArrayList(WindID);
		String ParantID=WindowList.get(0);
		String ChildID=WindowList.get(1);
		// switch to chide id
		driver.switchTo().window(ChildID);
		System.out.println(" chide id title = 	"+ driver.getTitle() );*/
		for(String Windowid:WindID) {
			String title=driver.switchTo().window(Windowid).getTitle();
			if(title.equals("OrangeHRM")) {
				System.out.println(" Home window");}
				if(title.equals("Human Resources Management Software | OrangeHRM HR Software")) {
					System.out.println(" child window");
				
			}
		}

		driver.quit();			
	}
}
