package vnc.handzap;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;

public class FindAJob {
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
    	driver.findElement(By.xpath("//*[@text='Find a Job']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("btn_new_search")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id='et_keywords']")).sendKeys("Do an electrician job");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@id='til_categories']]]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id='iv_icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Electrical']]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@text='Select']")).click();
    	driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@id='til_rate']]]")).click();
    	driver.findElement(By.xpath("//*[@text='Fixed Budget']")).click();
    	driver.findElement(By.xpath("//*[@text='SELECT']")).click();
    	driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@id='til_payment_method']]]")).click();
    	driver.findElement(By.xpath("//*[@text='Cash']")).click();
    	driver.findElement(By.xpath("//*[@text='SELECT']")).click();
    	driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@id='til_location']]]")).click();
    	driver.findElement(By.xpath("//*[@text='Set Location on Map']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@text='Set Location']")).click();
    	Thread.sleep(7000);
    	driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@id='til_radius']]]")).click();
    	driver.findElement(By.xpath("//*[@text='No Preference']")).click();
    	driver.findElement(By.xpath("//*[@text='SELECT']")).click();
    	driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@id='til_job_term']]]")).click();
    	driver.findElement(By.xpath("//*[@text='No Preference']")).click();
    	driver.findElement(By.xpath("//*[@text='SELECT']")).click();
    	driver.findElement(By.xpath("//*[@text='Find']")).click();
    	Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown() {
        //driver.quit();
    }
}