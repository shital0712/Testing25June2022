package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import Pages.OverviewPage;
import Pages.YourInfoPage;

public class OverviewPageTest extends TestBase {

	LoginPage login;
	InventoryPage invent;
	CartPage cart ;
	YourInfoPage info;
	OverviewPage view;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
		invent = new InventoryPage();
		cart = new CartPage();
		info = new YourInfoPage();
		view = new OverviewPage();
	}
	@Test(enabled = true)
	public void verifyCheckoutTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		String result = view.verifyCheckout();
		Assert.assertEquals(result, "CHECKOUT: OVERVIEW");
	}
	@Test(enabled = true)
	public void verifyAppLogoTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		boolean result = view.verifyAppLogo();
		Assert.assertEquals(result,true);
	}
	@Test(enabled = true)
	public void verifyQTYTextTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		boolean result = view.verifyQTYText();
		Assert.assertEquals(result,true);
	}
	@Test(enabled = true)
	public void verifyDescriptionTextTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
		boolean result = view.verifyDescriptionText();
		Assert.assertEquals(result,true);
	}
	@Test(enabled = true)
	public void verifyPaymentInfoTextTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
        String result = view.verifyPaymentInfoText();
		Assert.assertEquals(result,"Payment Information:");
	}
	@Test(enabled = true)
	public void verifySauceCardNoTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
        String result = view.verifySauceCardNo();
		Assert.assertEquals(result,"SauceCard #31337");
	}
	@Test(enabled = true)
	public void verifyShippingInfoTextTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
        String result = view.verifyShippingInfoText();
		Assert.assertEquals(result,"Shipping Information:");
	}
	@Test(enabled = true)
	public void verifyFreePonyExpTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
        String result = view.verifyFreePonyExp();
		Assert.assertEquals(result,"FREE PONY EXPRESS DELIVERY!");
	}
	@Test(enabled = true)
	public void verifyItemTotalAmountTextTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
        String result = view.verifyItemTotalAmountText();
		Assert.assertEquals(result,"Item total: $129.94");
	}
	@Test(enabled = true)
	public void verifyTaxAmountTextTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
        String result = view.verifyTaxAmountText();
		Assert.assertEquals(result,"Tax: $10.40");
	}
	@Test(enabled = true)
	public void verifyTotalAmountTextTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
        String result = view.verifyTotalAmountText();
		Assert.assertEquals(result,"Total: $140.34");
	}
	@Test(enabled = true)
	public void verifyCancelBtnTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
        boolean result = view.verifyCancelBtn();
		Assert.assertEquals(result,true);
	}
	@Test(enabled = true)
	public void verifyFinishBtnTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		info.verifyUserInfo();
        view.verifyFinishBtn();
	}
	
    @AfterMethod
	
	public void closeBrowser()
	{
		driver.close();
	}
}
