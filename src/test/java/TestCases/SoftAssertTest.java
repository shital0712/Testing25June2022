package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.ReadData;

public class SoftAssertTest extends TestBase {

	LoginPage login;
	InventoryPage invent;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initialization();
		invent = new InventoryPage();
		login = new LoginPage();
	}
	@Test(enabled=true)
	public void verifySmallLogo1Test() throws Exception
	{
		SoftAssert s = new SoftAssert();
		System.out.println("Execution Started");
		login.loginToApp1();
		boolean result = invent.verifySmallLogo1();
		s.assertEquals(result,false);
		System.out.println("Execution Ended");
		s.assertAll();
	}
	
	@Test(enabled = false)
	public void verifyBigLogoTest() throws Exception
	{
		login.loginToApp1();
		boolean result = invent.verifyBigLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled = false)
	public void add6ProductTest() throws Exception
	{
		login.loginToApp1();
		String result = invent.add6Product();
		Assert.assertEquals(result, "6");
	}
	@Test(enabled = false)
	public void remove2ProductTest() throws Exception
	{
		login.loginToApp1();
		invent.add6Product();
		invent.remove2Product();
		
	}
	@Test(enabled = false)
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


