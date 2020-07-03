package vnc.handzap;

//package <set your test package>;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class Login {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "I7RKTSEYFQLZ4LHM");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.handzap.handzap.global");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.handzap.handzap.ui.main.splash.SplashScreenActivity");
        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testUntitled() throws Exception {
        /*driver.findElement(By.xpath("//*[@text='Log In']")).sendKeys("8978036609");
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='et_password']")));
        driver.findElement(By.xpath("//*[@id='et_password']")).sendKeys("saibalaji11");
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Next']")));
        driver.findElement(By.xpath("//*[@text='Next']")).click();*/
    	driver.findElement(By.id("btn_login")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("et_phone_number")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.id("et_phone_number")).sendKeys("8978036609");
    	Thread.sleep(3000);
    	driver.findElement(By.id("et_password")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("et_password")).sendKeys("saibalaji11");
    	Thread.sleep(2000);
    	driver.findElement(By.id("action_next")).click();
    	Thread.sleep(7000);
    	driver.findElement(By.xpath("//*[@contentDescription='Open navigation drawer']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("tv_user_email")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("tv_logout")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("tv_ok_action")).click();
    	Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}