package pageObjectModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExecutionClas {
	public static WebDriver driver;

	@BeforeClass
	void steup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	static void login() {
		PageFactoryClass pg=new PageFactoryClass(driver);
		pg.set_username();
		pg.set_password();
		pg.clickLogin();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@AfterClass
	public void closed() {
		driver.quit();
	}
}
