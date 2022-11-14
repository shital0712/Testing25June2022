package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class YourInfoPage extends TestBase{
	//verify to checkout your info text
	//verify firstname field is clickable or not
	//verify Lastname field is clickable or not
	//verify postalCode field is clickable or not
	//verify cancel btn is enable or not
	//verify continue btn is enable or not
	//verify menu btn is clickable or not
	//verify allItem text displayed or not
	//verify about text displayed or not
	//verify logout text displayed or not
	//verify reset text displayed or not
	//verify crossBtn click or not
	@FindBy(xpath = "//span[text()='Checkout: Your Information']")private WebElement checkoutText;
	@FindBy(xpath = "//input[@id='first-name']")private WebElement firstNameText;
	@FindBy(xpath = "//input[@id='last-name']")private WebElement lastNameText;
	@FindBy(xpath = "//input[@id='postal-code']")private WebElement postalCodeText;
	@FindBy(xpath = "//button[@id='cancel']")private WebElement cancelButton;
	@FindBy(xpath = "//input[@id='continue']")private WebElement continueButton;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']")private WebElement menuButton;
	
	@FindBy(xpath = "//button[@id='react-burger-cross-btn']")private WebElement crossButton;
	
	
	//Constructor
	public YourInfoPage()
	{
		PageFactory.initElements(driver,this);
	}
	//Method
	public String checkoutLabel()
	{
		return checkoutText.getText();
	}
	public void verifyUserInfo()
	{
		firstNameText.sendKeys("abc");
		lastNameText.sendKeys("xyz");
		postalCodeText.sendKeys("123");
		continueButton.click();
	}
	public boolean cancelbtn()
	{
		return cancelButton.isEnabled();
	}
	public boolean continueBtn()
	{
		return continueButton.isEnabled();
	}
	public void menuBtn()
	{
		menuButton.click();
	}
	
	public void crossBtn()
	{
		crossButton.click();
	}

}
