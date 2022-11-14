package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.ReadData;

public class InventoryPageTest extends TestBase {

	LoginPage login;
	InventoryPage invent;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		invent = new InventoryPage();
		login = new LoginPage();
	}
	@Test(enabled=true/* timeOut=2000*/)
	public void verifySmallLogo1Test() throws Exception
	{
		login.loginToApp1();
		boolean result = invent.verifySmallLogo1();
		Assert.assertEquals(result,true, "Failed jhali ka ??????");
		Assert.assertFalse(false);
		Assert.assertTrue(true);
		System.out.println("This is verifySmallLogo1Test ");
	}
	
	@Test(enabled=true)
	public void verifyBigLogoTest() throws Exception
	{
		login.loginToApp1();
		boolean result = invent.verifyBigLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled= true)
	public void add6ProductTest() throws Exception
	{
		login.loginToApp1();
		String result = invent.add6Product();
		Assert.assertEquals(result, "6");
	}
	@Test(enabled=true)
	public void remove2ProductTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		String result = invent.remove2Product();
		Assert.assertEquals(result,"4");
		
	}
	@Test(enabled=true)
	public void cartPageClickTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.cartPageClick();
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
}


