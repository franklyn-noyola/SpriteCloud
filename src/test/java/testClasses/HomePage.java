package testClasses;

import org.testng.annotations.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import configurationSection.settingFile;
import configurationSection.webElementsLinks;

import static org.testng.Assert.fail;

import java.util.ResourceBundle;

public class HomePage extends settingFile {
	public static StringBuffer verificationErrors = new StringBuffer();
	WebDriver driver; 
	ResourceBundle rb = ResourceBundle.getBundle("homePage");
	String baseURL = rb.getString("homePageURL");
	
	
	@BeforeTest	
	  public void setUp() {
		settingFile setFile = new settingFile();
		setFile.setUp();
		this.driver = setFile.driver;
	  				
		  }	
	
	@Test
	public void homPage() throws Exception {
		driver.get(baseURL);
		webElementsLinks webLinks = PageFactory.initElements(driver, webElementsLinks.class);
		webLinks.homePage();
		Thread.sleep(5000);
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