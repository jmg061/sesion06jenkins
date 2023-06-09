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
public class Sesion6MejoradaTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void sesion6Mejorada() {
    // Test name: Sesion6Mejorada
    // Step # | name | target | value
    // 1 | executeScript | return "Tarea-" + Math.floor(Math.random()*1500000) | TareaRandom
    vars.put("TareaRandom", js.executeScript("return \"Tarea-\" + Math.floor(Math.random()*1500000)"));
    // 2 | open | https://msdocs-node-mongo-2022-group11.azurewebsites.net/ | 
    driver.get("https://msdocs-node-mongo-2022-group11.azurewebsites.net/");
    // 3 | echo | ${TareaRandom} | 
    System.out.println(vars.get("TareaRandom").toString());
    // 4 | click | name=taskName | 
    driver.findElement(By.name("taskName")).click();
    // 5 | type | name=taskName | ${TareaRandom}
    driver.findElement(By.name("taskName")).sendKeys(vars.get("TareaRandom").toString());
    // 6 | click | css=.btn-success | 
    driver.findElement(By.cssSelector(".btn-success")).click();
    // 7 | assertText | xpath=//div[@class='row mb-2'][last()]//div[@class='col-sm-6'] | ${TareaRandom}
    assertThat(driver.findElement(By.xpath("//div[@class=\'row mb-2\'][last()]//div[@class=\'col-sm-6\']")).getText(), is("vars.get(\"TareaRandom\").toString()"));
    // 8 | storeXpathCount | xpath=//main/div[@class='row mb-2'] | count
    vars.put("count", driver.findElements(By.xpath("//main/div[@class=\'row mb-2\']")).size());
    // 9 | echo | ${count} | 
    System.out.println(vars.get("count").toString());
    // 10 | click | xpath=//div[@class='row mb-2'][last()]/div[4]/form/button | 
    driver.findElement(By.xpath("//div[@class=\'row mb-2\'][last()]/div[4]/form/button")).click();
    // 11 | if | ${count}==1 | 
    if ((Boolean) js.executeScript("return (arguments[0]==1)", vars.get("count"))) {
      // 12 | verifyElementNotPresent | xpath=//main/div[@class='row mb-2']/div | presente
      {
        List<WebElement> elements = driver.findElements(By.xpath("//main/div[@class=\'row mb-2\']/div"));
        assert(elements.size() == 0);
      }
      // 13 | else |  | 
    } else {
      // 14 | assertNotText | xpath=//div[@class='row mb-2'][last()]//div[@class='col-sm-6'] | ${TareaRandom}
      assertThat(driver.findElement(By.xpath("//div[@class=\'row mb-2\'][last()]//div[@class=\'col-sm-6\']")).getText(), is(not("vars.get(\"TareaRandom\").toString()")));
      // 15 | end |  | 
    }
    // 16 | click | name=taskName | 
    driver.findElement(By.name("taskName")).click();
    // 17 | type | name=taskName | ${TareaRandom}
    driver.findElement(By.name("taskName")).sendKeys(vars.get("TareaRandom").toString());
    // 18 | click | css=.btn-success | 
    driver.findElement(By.cssSelector(".btn-success")).click();
    // 19 | click | xpath=//div[@class='row mb-2'][last()]/div[3]/form/button | 
    driver.findElement(By.xpath("//div[@class=\'row mb-2\'][last()]/div[3]/form/button")).click();
    // 20 | assertText | xpath=//div[@class='row mb-3'][last()]/div | ${TareaRandom}
    assertThat(driver.findElement(By.xpath("//div[@class=\'row mb-3\'][last()]/div")).getText(), is("vars.get(\"TareaRandom\").toString()"));
    // 21 | close |  | 
    driver.close();
  }
}
