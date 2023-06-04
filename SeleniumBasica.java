package selenium;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions(); 
	    chromeOptions.setHeadless(true); 
	    driver = new ChromeDriver(chromeOptions);
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		//driver.close();
		driver.quit();
	}

	@Test
	public void Selenium() {
		driver.get("https://msdocs-node-mongo-2022-group11.azurewebsites.net/");
		driver.manage().window().setSize(new Dimension(970, 600));
		driver.findElement(By.name("taskName")).click();
		{
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[contains(.,\'Azure\')]")));
		}
		driver.findElement(By.name("taskName")).sendKeys("NuevaTarea");
		driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.cssSelector(".col-sm-6")).click();
		{
			List<WebElement> elements = driver.findElements(By.cssSelector(".col-sm-6"));
			assert (elements.size() > 0);
		}
		driver.findElement(By.cssSelector(".btn-danger")).click();
		{
			List<WebElement> elements = driver.findElements(By.cssSelector(".col-sm-6"));
			assert (elements.size() == 0);
		}
		driver.findElement(By.name("taskName")).click();
		driver.findElement(By.name("taskName")).sendKeys("NuevaTarea");
		driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.cssSelector(".col-sm-6")).click();
		{
			List<WebElement> elements = driver.findElements(By.cssSelector(".col-sm-6"));
			assert (elements.size() > 0);
		}
		driver.findElement(By.cssSelector(".btn-primary")).click();
		driver.findElement(By.cssSelector(".row:nth-child(8) > .col-sm-8")).click();
		{
			List<WebElement> elements = driver.findElements(By.cssSelector(".row:nth-child(8) > .col-sm-8"));
			assert (elements.size() > 0);
		}
		driver.close();
	}
}
