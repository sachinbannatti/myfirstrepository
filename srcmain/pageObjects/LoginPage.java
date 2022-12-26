package pageobjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public Properties prop;
	public LoginPage(WebDriver driver) throws IOException {
		prop=new Properties();
		String propPath=System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
		FileInputStream fis=new FileInputStream(propPath);
		prop.load(fis);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
		@FindBy(xpath = "//input[@name='username']")
		WebElement enterUserName;
		@FindBy(xpath = "//input[@name='pwd']")
		WebElement enterPassword;
		@FindBy(xpath = "//a[@id='loginButton']")
		WebElement clickOnLoginButton;
		@FindBy(xpath = "//a[@id='logoutLink']")
		WebElement clickOnLogout;
	
	
	
	public void enterUserName() {
		enterUserName.sendKeys(prop.getProperty("username"));
		
	}
	public void enterPassword() {
	enterPassword.sendKeys(prop.getProperty("password"));
		
	}
	public void clickOnLoginButton() {
		 clickOnLoginButton.click();
		
	}
	public void clickOnLogout() {
		clickOnLogout.click();
	}
	
}

