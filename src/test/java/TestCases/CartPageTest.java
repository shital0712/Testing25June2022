package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.ReadData;

public class CartPageTest extends TestBase{
	LoginPage login;
	InventoryPage invent;
	CartPage cart ;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		login = new LoginPage();
		invent = new InventoryPage();
		cart = new CartPage();
	}
	
	@Test(enabled=true)
	public void yourCartTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		
		String result = cart.yourCart();
		Assert.assertEquals(result,"YOUR CART");
	}
	
	@Test
	public void appLogo1Test() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		
		boolean result = cart.appLogo1();
		Assert.assertEquals(result, true);
		
	}
	@Test(enabled=true)
	public void qtyLabel1Test() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		
		String result = cart.qtyLabel1();
		Assert.assertEquals(result, "QTY");
		
	}
	@Test(enabled=true)
	public void descriLabel1Test() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		
		String result = cart.descriLabel1();
		Assert.assertEquals(result, "DESCRIPTION");
		
	}
	@Test(enabled=true)
	public void continueShoppingLabelTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		
		boolean result = cart.continueShoppingLabel();
		Assert.assertEquals(result, true);
	}
	@Test(enabled=true)
	public void checkoutLabelTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		
		boolean result = cart.checkoutLabel();
		Assert.assertEquals(result, true);
		
	}
	@Test(enabled=true)
	public void checkoutButtonTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
		cart.checkoutButton();
		
	}

	@AfterMethod
	
	public void closeBrowser()
	{
		driver.close();
	}
	

}
