package configurationSection;

import org.openqa.selenium.chrome.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.fail;

import java.io.File;
import java.time.Duration;




public class settingFile  {
	public WebDriver driver;
	public static StringBuffer verificationErrors = new StringBuffer();

	
	
	
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver", "C:\\workspace\\spritecloud\\SeleniumLibrary\\chromedriver.exe");
	  		ChromeOptions options = new ChromeOptions();
	  		options.addArguments("--lang=es-ES");  		
	  			/*DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
	  			cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true
	  			cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);*/
	  				//ChromeOptions opts =  new ChromeOptions(); poner esta opción cuando se vaya a subir a Git
	  				//opts.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"); poner esta opción cuando se vaya a subir a Git
	  				driver = new ChromeDriver(options);//opts); poner esta opción cuando se vaya a subir al Git
	  				driver.manage().window().maximize();
	  				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	  				
		  }	
	  
	  public void tearDown() {			  
		    driver.close();
		    String verificationErrorString = verificationErrors.toString();
		    if (!"".equals(verificationErrorString)) {
		      fail(verificationErrorString);
		    }
		}
	
}