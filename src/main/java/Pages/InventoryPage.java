package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;
import Utility.ReadData;

public class InventoryPage extends TestBase {
	//TC1- verify the visibility of	small logo
	//TC2- verify the visibility of	big	logo
	//TC3- Add6 product	in	cart
	//TC4- Remove 2	product	from cart
	//TC5- verify the visibility of	twitter	logo(Assignment)
	//TC6- verify the visibility of	fb	logo(Assignment)
	//TC7- verify the visibility of	linkedin logo(Assignment)
	//TC8 - enter into cart Page
	
	//Object Repo
	@FindBy(xpath="//div[@class='peek']")private WebElement smallLogo1;
	@FindBy(xpath="//img[@alt='Swag Bot Footer']")private WebElement bigLogo;
	@FindBy(xpath="//select[@class='product_sort_container']")private WebElement sorterDropdown;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement backpackProduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")private WebElement bikeLightProduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement tshirtBlackProduct16;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")private WebElement jacketProduct50;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-onesie']")private WebElement tshirtProduct8;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")private WebElement tshirtRedProduct16;
	
	@FindBy(xpath="//a[text()='Twitter']")private WebElement twitterLogo;
	@FindBy(xpath="//a[text()='Facebook']")private WebElement facebookLogo;
	@FindBy(xpath="//a[text()='LinkedIn']")private WebElement linkedInLogo;
	@FindBy(xpath="//button[@id='remove-sauce-labs-fleece-jacket']")private WebElement removeP1;
	@FindBy(xpath="//button[@id='remove-test.allthethings()-t-shirt-(red)']")private WebElement removeP2;
	@FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement productCountIcon;
	@FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement cartPage;
	@FindBy(xpath ="//span[@class='shopping_cart_badge']")private WebElement removeCount;
//	@FindBy(xpath = "//span[text()='Your Cart']")private WebElement yourCartText;
	@FindBy(xpath="//span[text()='4']")private WebElement inventoryCartBtn;
	
	//Constructor
	
	public InventoryPage()
	{
		PageFactory.initElements(driver,this);
	}
	//Methods
	public boolean verifySmallLogo1()
	{
		return smallLogo1.isDisplayed();
	}
	public boolean verifyBigLogo()
	{
		return bigLogo.isDisplayed();
	}
	public String add6Product() throws Exception
	{
		Select s = new Select(sorterDropdown);
		s.selectByVisibleText(ReadData.readExcelFile(0, 0));
		backpackProduct.click();
		bikeLightProduct.click();
		tshirtBlackProduct16.click();
		jacketProduct50.click();
		tshirtProduct8.click();
		tshirtRedProduct16.click();
		twitterLogo.isDisplayed();
		facebookLogo.isDisplayed();
		linkedInLogo.isDisplayed();
		
		String count = productCountIcon.getText();
		return count;
	}	
		public String remove2Product()
		{
			removeP1.click();
			removeP2.click();
			cartPage.click();
			String count = inventoryCartBtn.getText();
			return count;
			
		}
		
		public void cartPageClick()
		{
			cartPage.click();
		}
}
