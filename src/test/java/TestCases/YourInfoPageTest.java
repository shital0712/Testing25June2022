package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import Pages.YourInfoPage;

public class YourInfoPageTest extends TestBase {
	LoginPage login;
	InventoryPage invent;
	CartPage cart ;
	YourInfoPage info;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
		invent = new InventoryPage();
		cart = new CartPage();
		info = new YourInfoPage();
	}
	@Test(enabled = true)
	public void checkoutLabelTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		
		String result = info.checkoutLabel();
		Assert.assertEquals(result,"CHECKOUT: YOUR INFORMATION");
		
	}
	@Test(enabled = true)
	public void verifyUserInfoTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
	}
	@Test(enabled = true)
	public void cancelbtnTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
        boolean result = info.cancelbtn();
        Assert.assertEquals(result, true);
        
	}
	@Test(enabled = true)
	public void continueBtnTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
        boolean result = info.continueBtn();
        Assert.assertEquals(result, true);
        
	}
	@Test(enabled = true)
	public void menuBtnTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.menuBtn();

	}
	
	@Test(enabled = true)
	public void crossBtnTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.menuBtn();
		info.crossBtn();
	}

    @AfterMethod
	
	public void closeBrowser()
	{
		driver.close();
	}
	

}
