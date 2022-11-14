package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CompletePage extends TestBase {
	//verify app logo on complete page
	//verify checkout complete text
	//verify thank you for user order label
	//verify dispatch label
	//verify pony express logo
	//verify back home btn
	//verify menu icon
	//verify about btn
	//verify all item btn
	//verify logout btn
	//verify reset btn
	//verify cross icon
	
	@FindBy(xpath ="//div[@class='app_logo']")private WebElement appLogo;
	@FindBy(xpath ="//span[text()='Checkout: Complete!']")private WebElement checkoutText;
	@FindBy(xpath ="//h2[text()='THANK YOU FOR YOUR ORDER']")private WebElement thankYouText;
	@FindBy(xpath ="//div[@class='complete-text']")private WebElement dispatchText;
	@FindBy(xpath="//img[@alt='Pony Express']")private WebElement verifyPonyLogo;
	@FindBy(xpath ="//button[@id='back-to-products']")private WebElement backHomeBtn;
	@FindBy(xpath ="//button[@id='react-burger-menu-btn']")private WebElement menuBtn;
	@FindBy(xpath ="//a[@id='inventory_sidebar_link']")private WebElement allItemText;
	@FindBy(xpath ="//a[@id='about_sidebar_link']")private WebElement aboutText;
	@FindBy(xpath ="//a[@id='logout_sidebar_link']")private WebElement logoutText;
	@FindBy(xpath ="//a[@id='reset_sidebar_link']")private WebElement resetAppText;
	
	//Constructor
	public CompletePage()
	{
		PageFactory.initElements(driver,this);
	}
	//Method
	public boolean verifyAppLogo()
	{
		return appLogo.isDisplayed();
	}
	public String verifyCheckoutText()
	{
		return checkoutText.getText();
	}
	public String verifyThankYouText()
	{
		return thankYouText.getText();
	}
	public String verifyDispatchText()
	{
		return dispatchText.getText();
	}
	public boolean logoPony()
	{
	return verifyPonyLogo.isDisplayed();
	}
	public void verifyBackHomeBtn()
	{
	     backHomeBtn.click();
	}
	public boolean verifyBackHomeEnable()
	{
		return backHomeBtn.isEnabled();
	}
	public void verifyMenuBtn()
	{
		menuBtn.click();
	}
	
	public void verifyAllItemText()
	{
		allItemText.click();
	}
	
	public void verifyAboutText()
	{
		aboutText.click();
	}
	
	public void verifyLogoutText()
	{
		logoutText.click();
	}
	
	public void verifyResetAppText()
	{
		resetAppText.click();
	}
	
	
}
