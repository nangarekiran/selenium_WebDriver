package dynamicTablePagination;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlePaginationDynamicTable {
	public static void main(String[] args) throws InterruptedException {
		//lunched browser
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("name")).sendKeys("Kiran");
		driver.findElement(By.id("email")).sendKeys("kiran.nangare1998@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("98603199102");
		driver.findElement(By.id("textarea")).sendKeys("B-507 dnv Elite homes tathvade pune");
		System.out.println(" all personal detailed filed successfully");
		
		// Click on radio buttons:
		driver.findElement(By.xpath("//input[@value='male']")).click();
		Thread.sleep(1000);
		System.out.println(" Male gender selected successfully");
 
		// selecting the all check boxes
		List<WebElement> checkbox=driver.findElements(By.xpath("//*[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		System.out.println(" check box size "+checkbox.size());
		for(int i=0; i<checkbox.size(); i++) {
			checkbox.get(i).click();
		}
	
		// Handle dropdown
		WebElement countrydrop=driver.findElement(By.xpath("//select[@id='country']"));
		Select s1=new Select(countrydrop);
		s1.selectByIndex(1);
		
		
	// capture all option from drop down
		List<WebElement> listdrop=s1.getOptions();
		System.out.println(" all option ="+listdrop.size());
		/*
        for(int i=0; i<listdrop.size(); i++) {
        	//listdrop.get(i).getText();
        	System.out.println("drop down options= "+listdrop.get(i).getText());  }*/
		for(WebElement dropOption:listdrop) {
			System.out.println(dropOption.getText());
		}
      
		driver.quit();
	}

}
