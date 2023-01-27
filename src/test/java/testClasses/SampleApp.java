package testClasses;

import static org.testng.Assert.fail;

import java.util.ResourceBundle;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import configurationSection.settingFile;
import configurationSection.sampleApp;

public class SampleApp extends settingFile {
	public static StringBuffer verificationErrors = new StringBuffer();
	WebDriver driver; 
	ResourceBundle rb = ResourceBundle.getBundle("homePage");
	String userName = rb.getString("user");
	String passWord = rb.getString("password");
	String baseURL = rb.getString("homePageURL");
	
	
	@BeforeTest	
	  public void setUp() {
		settingFile setFile = new settingFile();
		setFile.setUp();
		this.driver = setFile.driver;
	  				
		  }	
	
	@Test
	public void sampleApp() throws Exception {
		driver.get(baseURL);
		sampleApp sampleApp = PageFactory.initElements(driver, sampleApp.class);
		sampleApp.sampleAppFunction(userName, passWord);
		Thread.sleep(2000);
	}
	
	  @AfterTest
	  public void tearDown() {	
		  driver.quit();
		    String verificationErrorString = verificationErrors.toString();
		    if (!"".equals(verificationErrorString)) {
		      fail(verificationErrorString);
		}
	  }
	
}
