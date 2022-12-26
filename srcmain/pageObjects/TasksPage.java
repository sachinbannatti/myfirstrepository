package pageobjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
	WebDriver driver;
	public Properties prop;
	
	public TasksPage(WebDriver driver) throws IOException {
		prop=new Properties();
		String propPath=System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
		FileInputStream fis=new FileInputStream(propPath);
		prop.load(fis);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//div[@id='container_tasks']")
	WebElement clickOnTasks;
	
	@FindBy(xpath = "//div[@class='title ellipsis']")
	WebElement buttonAddNew;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	WebElement buttonNewCustomer;
	
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	WebElement enterTheCustomerName;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	WebElement enterDescription;
	
	@FindBy(xpath = "//div[contains(text(),'Create Customer')]")
	WebElement clickOnCreateCustomer;
	
	@FindBy(xpath ="(//input[@type='text'])[5]" )
	WebElement enterCustomerName;
	
	@FindBy(xpath ="(//div[@class='node customerNode notSelected editable'])[10]" )
	WebElement settingIconViewCustomerSettings;
	
	@FindBy(xpath = "(//div[@class='editButton'])[17]")
	WebElement clickOnSettingButton;
	
	@FindBy(xpath = "(//div[@class='action'])[1]")
	WebElement clickOnAction;
	
	@FindBy(xpath = "(//div[@class='deleteButton'])[1]")
	WebElement clickOnDeleteButton;
	
	@FindBy(xpath = "//span[normalize-space()='Delete permanently']")
	WebElement clickOnPernmentDelete;
	
	public void clickOnTasks() {
		clickOnTasks.click();
	}
	public void buttonAddNew() {
		buttonAddNew.click();
	}
	public void buttonNewCustomer() {
		buttonNewCustomer.click();
	}
	public void enterTheCustomerName() {
		enterTheCustomerName.sendKeys(prop.getProperty("customername"));
	}
	public void enterDescription() {
		enterDescription.sendKeys(prop.getProperty("description"));
	}
	public void clickOnCreateCustomer() {
		clickOnCreateCustomer.click();
	}
	public void enterCustomerName() {
		enterCustomerName.sendKeys("sachin bannatti");
	}
	
	public void settingIconViewCustomerSettings() {
		Actions act=new Actions(driver);
		act.moveToElement(settingIconViewCustomerSettings).perform();
	}
	public void clickOnSettingButton() {
		clickOnSettingButton.click();
	}
	public void clickOnAction() {
		clickOnAction.click();
	}
	public void clickOnDeleteButton() {
		clickOnDeleteButton.click();
	}
	
}






