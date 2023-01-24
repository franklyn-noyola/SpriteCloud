package configurationSection;

import org.openqa.selenium.support.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

import java.util.ResourceBundle;

public class classAttribute {
	WebDriver driver;
	ResourceBundle rb = ResourceBundle.getBundle("homePage");
	String ClassAttributeTitle = rb.getString("ClassAttributeTitle");
	String classAttributeTitlePage;
	
	@FindBy(how=How.XPATH, using = "//*[@id='overview']/div/div[1]/div[2]/h3/a")
	@CacheLookup
		WebElement classAttributePath;
	
	@FindBy(how=How.XPATH, using = "//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")
	@CacheLookup
		WebElement blueButton;
	
	@FindBy(how=How.XPATH, using = "/html/body/section/div/h3")
	@CacheLookup
		WebElement ClassAttributePageTitle;
	
	public classAttribute (WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void classAttributeFunction() throws Exception {
		try {
		classAttributePath.click();
		Thread.sleep(2000);		
		classAttributeTitlePage = ClassAttributePageTitle.getText();
		System.out.println("Clicing on "+classAttributeTitlePage+" Link");
		assertEquals(ClassAttributeTitle, classAttributeTitlePage);
		System.out.println(classAttributeTitlePage+ " Page is displayed");		
		System.out.println("Scenarios to perform this Test in this page:");
		System.out.println("1. Record primary (blue) button click and press ok in alert popup.");
		System.out.println("2. Then execute your test to make sure that it can identify the button using btn-primary class." );
		Thread.sleep(1000);
		blueButton.click();
		Thread.sleep(1000);
		driver.switchTo().alert();
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Text Popup: "+alertText);
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	
}