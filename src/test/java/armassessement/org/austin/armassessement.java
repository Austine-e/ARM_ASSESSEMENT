package armassessement.org.austin;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class armassessement {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  System.setProperty("webdriver.firefox.driver",
				"C:\\Users\\AustinEkpene\\eclipse-workspace\\org.austin\\src\\geckodriver.exe");
  driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  
  @Test
  public void aRMTEST1() throws InterruptedException {
    driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-GB&.intl=gb&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
    driver.manage().window().setSize(new Dimension(1050, 708));
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.id("login-username")).sendKeys("ndubuisiuwadinachi");
    driver.findElement(By.id("login-signin")).click();
//    driver.findElement(By.cssSelector("#login-passwd")).clear();
    Thread.sleep(10000);
    driver.findElement(By.cssSelector("#login-passwd")).sendKeys("Blessing@02");
    driver.findElement(By.id("login-signin")).click();
    driver.findElement(By.linkText("Compose")).click();
    {
      WebElement element = driver.findElement(By.linkText("Compose"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.id("message-to-field")).sendKeys("ndubuisiuwadinachi@yahoo.com");
    driver.findElement(By.cssSelector(".je_0")).click();
    driver.findElement(By.cssSelector(".je_0")).sendKeys("HI");
    {
      WebElement element = driver.findElement(By.cssSelector(".rte"));
      js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'Automated test'}", element);
    }
    driver.findElement(By.cssSelector(".q_Z2aVTcY > span")).click();
    driver.findElement(By.cssSelector(".Q_fq7 > .J_x")).click();
    assertThat(driver.findElement(By.cssSelector(".m_Z12nDQf:nth-child(2) .u_b:nth-child(1) .D_F:nth-child(1) > span:nth-child(1)")).getText(), is("seekaustinekara@yahoo.com <seekaustinekara@yahoo.com>"));

  }
}


