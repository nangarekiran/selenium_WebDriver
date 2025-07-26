package pageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageFactoryClass {
	WebDriver driver;
	// Constructor
	PageFactoryClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);//Pagefactory it is predefine class which is already avaiable in selenium 
		// webdriver in that we need call one method initElements(driver, this) this method will make sure this drivrt is applicable all element is available all loctor internally.
	}
	// Loctor using the @FindBy(Xpath="") TESTNG anotoation
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement user_name;
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement password;
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement login_button;
	// action methods
	public void set_username() {
		user_name.sendKeys("admin");
	}
	public void set_password() {
		password.sendKeys("admin123");
	}
	public void clickLogin() {
		login_button.click();

	}

}
