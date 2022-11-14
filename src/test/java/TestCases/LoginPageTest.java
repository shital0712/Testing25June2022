package TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import Base.TestBase;
import Pages.LoginPage;
import Utility.CaptureScreenshot;
import Utility.ReadData;

public class LoginPageTest extends TestBase {
	LoginPage login;
	//It is	prerequisite to	run	the	test case open the browser+enter URL
	//This will	execute	multiple times depend on number	of test cases
    @BeforeMethod
	public void setup() throws Exception
	{
    	initialization();
    	login = new LoginPage();
	}
    @Test(enabled=true/* dependsOnMethods="verifyTitleTest", priority=2*/)
    public void verifyLoginLogoTest()
    {
    	boolean result = login.verifyLoginLogo();
    	Assert.assertEquals(result, true);
    	System.out.println("verifyLoginLogoTest");
    	
    }
    @Test(enabled=true/*dependsOnMethods="verifyTitleTest",priority=3 invocationCount=5*/)
    public void verifyBotLogoTest()
    {
    	boolean result = login.verifyBotLogo();
    	Assert.assertEquals(result,true);
    	System.out.println("verifyBotLogoTest");
    }
    
  //Test case to login to application and verify label
    @Test(enabled=true )
	public void loginToApp1Test() throws Exception
	{
		String label = login.loginToApp1();
		Assert.assertEquals(label, "PRODUCTS");
//		Assert.assertEquals(label, ReadData.readExcelFile(1,0));
		System.out.println("loginToApp1Test");
	}
	//Test case to login to	application	and	verify	URL
	@Test(enabled=true)
	public void loginToApp2Test() throws Exception
	{
		Assert.assertEquals(login.loginToApp2(),"https://www.saucedemo.com/inventory.html");
		System.out.println("loginToApp2Test");
	}
	//Test to verify Title
	@Test(enabled=true)
	public void verifyTitleTest() throws Exception
	{
		String title = login.verifyTitle();
		Assert.assertEquals(title,"Swag Labs");
//		Assert.assertEquals(title, ReadData.readExcelFile(1, 2));
		System.out.println("verifyTitleTest");
	}
	//Test case	to verify current URL
	@Test(enabled=true)
	public void verifyUrlTest() throws Exception
	{
		String url = login.verifyUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/");
//		Assert.assertEquals(url, ReadData.readExcelFile(1,3));
		System.out.println("verifyUrlTest");
	}
	//This is post action after	running	the	test case and will close the browser	
	//This will execute	multiple times depend on number	of test cases
	
	@AfterMethod
	public void closeBrowser(ITestResult it) throws Exception
	{
		if(ITestResult.FAILURE == it.getStatus())
		{
			CaptureScreenshot.screenshot(it.getName());
		}
		driver.close();
	}
	
	
}
