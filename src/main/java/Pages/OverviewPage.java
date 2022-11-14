package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class OverviewPage extends TestBase {
	//verify to checkout overview text
	//verify to app logo on overview page
	//verify to qty text on overview page
	//verify to description text on overview page
	//verify to payment info text on overview page
	//verify to SauceCard number text on overview page
	//verify to Shipping info text on overview page
	//verify to Free pony express delivery text on overview page
	//verify to item total amount text on overview page
	//verify to tax amount text on overview page
	//verify to Total amount text on overview page
	//verify to Finish btn enable or not on overview page
	//verify to cancel btn enable or not on overview page
	@FindBy(xpath ="//span[text()='Checkout: Overview']")private WebElement checkoutText;
	@FindBy(xpath ="//div[@class='app_logo']")private WebElement appLogo;
	@FindBy(xpath ="//div[text()='QTY']")private WebElement quantityText;
	@FindBy(xpath ="//div[text()='DESCRIPTION']")private WebElement descriText;
	@FindBy(xpath ="//div[text()='Payment Information:']")private WebElement paymentInfoText;
	@FindBy(xpath ="//div[text()='SauceCard #31337']")private WebElement sauceCardNo;
	@FindBy(xpath ="//div[text()='Shipping Information:']")private WebElement shippingInfoText;
	@FindBy(xpath ="//div[text()='FREE PONY EXPRESS DELIVERY!']")private WebElement freePonyExp;
	@FindBy(xpath ="//div[@class='summary_subtotal_label']")private WebElement itemTotalAmountText;
	@FindBy(xpath ="//div[@class='summary_tax_label']")private WebElement taxAmountText;
	@FindBy(xpath ="//div[@class='summary_total_label']")private WebElement totalAmountText;
	@FindBy(xpath ="//button[@id='cancel']")private WebElement cancelButton;
	@FindBy(xpath ="//button[@id='finish']")private WebElement finishButton;
	
	//Constructor
	public OverviewPage()
	{
			PageFactory.initElements(driver,this);
	}
	//Method
	public String verifyCheckout()
	{
		return checkoutText.getText();
	}
	public boolean verifyAppLogo()
	{
		return appLogo.isDisplayed();
	}
	public boolean verifyQTYText()
	{
		return quantityText.isDisplayed();
	}
	public boolean verifyDescriptionText()
	{
		return descriText.isDisplayed();
	}
	public String verifyPaymentInfoText()
	{
		return paymentInfoText.getText();
	}
	public String verifySauceCardNo()
	{
		return sauceCardNo.getText();
	}
	public String verifyShippingInfoText()
	{
		return shippingInfoText.getText();
	}
	public String verifyFreePonyExp()
	{
		return freePonyExp.getText();
	}
	public String verifyItemTotalAmountText()
	{
		return itemTotalAmountText.getText();
	}
	public String verifyTaxAmountText()
	{
		return taxAmountText.getText();
	}
	public String verifyTotalAmountText()
	{
		return totalAmountText.getText();
	}
	public boolean verifyCancelBtn()
	{
		return cancelButton.isDisplayed();
	}
	public void verifyFinishBtn()
	{
		finishButton.click();
	}



	

}
