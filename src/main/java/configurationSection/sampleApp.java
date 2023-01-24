package configurationSection;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.support.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import java.util.ResourceBundle;

public class sampleApp {
	WebDriver driver;
	ResourceBundle rb = ResourceBundle.getBundle("homePage");
	String SampleAppTitle = rb.getString("SampleAppTitle");
	String SampleAppTitlePage;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[4]/div[2]/h3/a")
	@CacheLookup
		WebElement SampleAppPath;
	
	@FindBy(how=How.NAME, using = "UserName")
	@CacheLookup
		WebElement userNameField;
	
	@FindBy(how=How.NAME, using = "Password")
	@CacheLookup
		WebElement passWordField;
	
	@FindBy(how=How.ID, using = "loginstatus")
	@CacheLookup
		WebElement loginStatus;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement SampleAppPageTitle;
	
	@FindBy(how=How.ID, using = "login")
	@CacheLookup
		WebElement loginButton;
	
	public sampleApp(WebDriver driver) {
		this.driver = driver;
	}
	
	public void sampleAppFunction(String user, String password) throws Exception {
		try {
		SampleAppPath.click();
		Thread.sleep(2000);		
		SampleAppTitlePage= SampleAppPageTitle.getText();
		System.out.println("Clicing on "+SampleAppTitlePage+" Link");
		assertEquals(SampleAppTitle, SampleAppTitlePage);
		System.out.println("Scenario to perform this Test in this page: Fill in and submit the form. For successfull login use any non-empty user name and `pwd` as password." );
		Thread.sleep(1000);
		System.out.println(SampleAppTitlePage+ " Page is displayed");
		userNameField.sendKeys(user);
		System.out.println("UserName = "+user);
		passWordField.sendKeys(password);
		System.out.println("PassWord = "+password);
		loginButton.click();
		Thread.sleep(1000);
		String status = loginStatus.getText();
		System.out.println(status);
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	
}
