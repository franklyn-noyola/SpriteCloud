package testClasses;

import static org.testng.Assert.fail;

import java.util.ResourceBundle;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import configurationSection.settingFile;
import configurationSection.textInput;

public class TextInput extends settingFile {
	public static StringBuffer verificationErrors = new StringBuffer();
	WebDriver driver; 
	ResourceBundle rb = ResourceBundle.getBundle("homePage");
	String inputText = rb.getString("textInput");
	String baseURL = rb.getString("homePageURL");
	
	
	@BeforeTest	
	  public void setUp() {
		settingFile setFile = new settingFile();
		setFile.setUp();
		this.driver = setFile.driver;
	  				
		  }	
	
	@Test
	public void textInput() throws Exception {
		driver.get(baseURL);
		textInput textInput = PageFactory.initElements(driver, textInput.class);
		textInput.textInputFunction(inputText);
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