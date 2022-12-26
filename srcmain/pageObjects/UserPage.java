package pageobjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	WebDriver driver;
	public Properties prop;
	
	public UserPage(WebDriver driver) throws IOException {
		prop=new Properties();
		String propPath=System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
		FileInputStream fis=new FileInputStream(propPath);
		prop.load(fis);
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//div[@id='container_users']")
	WebElement clickOnUserIcon;
	
	@FindBy(xpath = "(//div[@class='components_button_label'])[1]")
	WebElement clickOnNewUser;
	
	@FindBy(xpath = "(//input[@class='firstNameField inputFieldWithPlaceholder'])[2]")
	WebElement enterFirstname;
	
	@FindBy(xpath = "(//input[@tabindex='12'])[2]")
	WebElement enterMiddleName;
	
	@FindBy(xpath = "//input[@id='createUserPanel_emailField']")
	WebElement enterEmailId;
	
	@FindBy(xpath = "(//button[@id='ext-gen610'])[1]")
	WebElement clickOnDateIcon;
	
	@FindBy(xpath = "//span[normalize-space()='23']")
	WebElement clickOnDate;
	
	@FindBy(xpath = "//div[contains(text(),'Save & Send Invitation')]")
	WebElement clickOnSaveAndSendInvitation;
	
	
	
	@FindBy(xpath = "(//span[contains(text(),'Close')])[1]")
	WebElement clickOnClose;
	
	@FindBy(xpath = "//table[@class='userNameSelectorsTable']//div[@class='icon']")
	WebElement clickOnSearchUserIcon;
	
	@FindBy(xpath = "(//input[@placeholder='Start typing name...'])[1]")
	WebElement enterUserName;
	
	@FindBy(xpath = "//span[@class='userNameSpan']")
	WebElement clickOnUsername;
	
	@FindBy(xpath = "//div[@class='deleteButton actionButton']")
	WebElement clickOnDeleteButton;
	
	public void clickOnUserIcon() {
		clickOnUserIcon.click();
	}
	public void clickOnNewUser() {
		clickOnNewUser.click();
	}
	public void enterFirstname() {
		enterFirstname.sendKeys(prop.getProperty("firstname"));
	}
	public void enterMiddleName() {
		enterMiddleName.sendKeys(prop.getProperty("middlename"));
	}
	public void enterEmailId() {
		enterEmailId.sendKeys(prop.getProperty("emailid"));
	}
	public void clickOnDateIcon() {
		clickOnDateIcon.click();
	}
	public void clickOnDate() {
		clickOnDate.click();
	}
	public void clickOnSaveAndSendInvitation() {
		clickOnSaveAndSendInvitation.click();
	}
	public void clickOnClose() {
		clickOnClose.click();
		
	}
	public void clickOnSearchUserIcon() {
		clickOnSearchUserIcon.click();
	}
	public void enterUserName() {
		enterUserName.sendKeys(prop.getProperty("enterusername"));
	}
	public void clickOnUsername() {
		clickOnUsername.click();
	}
	public void clickOnDeleteButton() {
		clickOnDeleteButton.click();
	}

}







