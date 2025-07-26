package dynamicTablePagination;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
	public static void main(String[] args) throws InterruptedException {
		//lunched browser
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		  int row=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		 int col=driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th")).size();
		 System.out.println(row);
		 System.out.println(col);
		 // only 	Subject data from the 
		 /*for(int i=2; i<=row; i++) {
			 String data1= driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td[3]")).getText();
				System.out.println(data1+"\t");
		 }*/
		 
		 // first two co
		 for(int a=2; a<=row; a++){
			 for(int b=3; b<=4; b++) {
				 String data1= driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+a+"]//td["+b+"]")).getText();
					System.out.print(data1+"\t"); 
			 }
			 System.out.println("\t"); 
		 }
		 /*
		 for(int i=2; i<=row; i++) {
			 for(int j=1; j<=4; j++) {
				String data= driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(data+"\t");
			 }
			 System.out.println("  ");
		 }*/
		 
		 driver.quit();
		//Get data form static table
	}
}
