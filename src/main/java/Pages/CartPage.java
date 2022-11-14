package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase {
	
	//TC1 = verify the your cart text
	//TC2 = verify the text qty and description
	//TC3 = verify app Logo
	//TC4 = remove to 2Product
	//TC5 = Verify visibility of continue shopping btn
	//TC6 = Verify visibility of checkout
	
	//Object Repo
	
	@FindBy(xpath="//span[text()='Your Cart']")private WebElement yourCartLabel;
	@FindBy(xpath="//div[@class='app_logo']")private WebElement appLogo;
	@FindBy(xpath="//div[text()='QTY']")private WebElement qtyLabel;
	@FindBy(xpath="//div[text()='DESCRIPTION']")private WebElement descriLabel;
	
	@FindBy(xpath="//button[@id='continue-shopping']")private WebElement continueShopping;
	@FindBy(xpath="//button[@id='checkout']")private WebElement checkoutBtn;
	@FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement CartButton;

	//Constructor
	public CartPage()
	{
		PageFactory.initElements(driver,this);
	}
	//Methods
	public String yourCart()
	{
		return yourCartLabel.getText();
	}
	public boolean appLogo1()
	{
		return appLogo.isDisplayed();
	
	}
	public String qtyLabel1()
	{
		return qtyLabel.getText();
	}
	public String descriLabel1()
	{
		return descriLabel.getText();
	}
	public boolean continueShoppingLabel()
	{
		return continueShopping.isEnabled();
	}
	public boolean checkoutLabel()
	{
		return checkoutBtn.isEnabled();
	}
	public void checkoutButton()
	{
		checkoutBtn.click();
	}
	public void cartBtnClick()
	{
		CartButton.click();
	}

}
