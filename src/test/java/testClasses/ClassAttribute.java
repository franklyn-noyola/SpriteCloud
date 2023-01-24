package testClasses;

import static org.testng.Assert.fail;

import java.util.ResourceBundle;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import configurationSection.settingFile;
import configurationSection.classAttribute;


public class ClassAttribute extends settingFile {
	public static StringBuffer verificationErrors = new StringBuffer();
	WebDriver driver; 
	ResourceBundle rb = ResourceBundle.getBundle("homePage");
	String baseURL = rb.getString("homePageURL");
	
	
	/*@BeforeClass
	  public void setUp() {
	
	  				
		  }	*/
	
	@Test
	public void classAttribute() throws Exception {
		settingFile setFile = new settingFile();
		setFile.setUp();
		this.driver = setFile.driver;
		driver.get(baseURL);
		classAttribute classAttribute = PageFactory.initElements(driver, classAttribute.class);
		classAttribute.classAttributeFunction();
		Thread.sleep(2000);
		driver.close();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	}
	
	 /* @After
	  public void tearDown() {	
		  
		    }*/
		}
	
}