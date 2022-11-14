package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.CompletePage;
import Pages.InventoryPage;
import Pages.LoginPage;
import Pages.OverviewPage;
import Pages.YourInfoPage;

public class CompletePageTest extends TestBase {
	LoginPage login;
	InventoryPage invent;
	CartPage cart ;
	YourInfoPage info;
	OverviewPage view;
	CompletePage complete;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
		invent = new InventoryPage();
		cart = new CartPage();
		info = new YourInfoPage();
		view = new OverviewPage();
		complete = new CompletePage();
	}
	@Test(enabled = true)
	public void verifyAppLogoTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		view.verifyFinishBtn();
		boolean result = complete.verifyAppLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = true)
	public void verifyCheckoutTextTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		view.verifyFinishBtn();
		String result = complete.verifyCheckoutText();
		Assert.assertEquals(result,"CHECKOUT: COMPLETE!");
	}
	@Test(enabled = true)
	public void verifyThankYouTextTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		view.verifyFinishBtn();
		String result = complete.verifyThankYouText();
		Assert.assertEquals(result,"THANK YOU FOR YOUR ORDER");
	}
	@Test(enabled = true)
	public void verifyDispatchTextTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		view.verifyFinishBtn();
		String result = complete.verifyDispatchText();
		Assert.assertEquals(result,"Your order has been dispatched, and will arrive just as fast as the pony can get there!");
	}
	@Test(enabled = true)
	public void verifyPonyLogoTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		view.verifyFinishBtn();
		boolean result = complete.logoPony();
		Assert.assertEquals(result,true);
	}
	@Test(enabled =true)
	public void verifyBackHomeBtnTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		view.verifyFinishBtn();
		complete.verifyBackHomeBtn();
	}

	@Test(enabled =true)
	public void verifyBackHomeEnableTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		view.verifyFinishBtn();
		boolean result = complete.verifyBackHomeEnable();
		Assert.assertEquals(result,true);
	}
	@Test(enabled = true)
	public void verifyMenuBtnTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		view.verifyFinishBtn();
		complete.verifyMenuBtn();
	}
	
	@Test(enabled = true)
	public void verifyAllItemTextTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		view.verifyFinishBtn();
		complete.verifyMenuBtn();
		complete.verifyAllItemText();
		
	}
	
	@Test(enabled = true)
	public void verifyAboutTextTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		view.verifyFinishBtn();
		complete.verifyMenuBtn();
		complete.verifyAboutText();
		
	}
	
	@Test(enabled = true)
	public void verifyLogoutTextTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		view.verifyFinishBtn();
		complete.verifyMenuBtn();
		complete.verifyLogoutText();
		
	}
	
	@Test(enabled = true)
	public void verifyResetAppTextTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		view.verifyFinishBtn();
		complete.verifyMenuBtn();
		complete.verifyResetAppText();
		
	}
	
	
    @AfterMethod
	
	public void closeBrowser()
	{
		driver.close();
	}

}
