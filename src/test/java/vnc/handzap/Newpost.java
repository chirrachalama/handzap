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

public class Newpost {
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
    	driver.findElement(By.id("btn_new_post")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.id("et_title")).sendKeys("Need electrician to fix the fan");
    	Thread.sleep(2000);
    	driver.findElement(By.id("et_description")).sendKeys("electric");
    	Thread.sleep(2000);
    	driver.findElement(By.id("et_categories")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id='iv_icon' and (./preceding-sibling::* | ./following-sibling::*)[@text='Electrical']]")).click();
    	Thread.sleep(2000);
    	//driver.findElement(By.xpath("//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']")).click();
    	driver.findElement(By.xpath("//*[@text='Select']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("et_budget")).sendKeys("2500");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@id='til_rate']]]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@text='Fixed Budget']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@text='SELECT']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@id='til_payment_method']]]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@text='Cash']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@text='SELECT']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@id='til_location']]]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("tv_location_map")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.id("btn_select_location")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@id='til_start_date']]]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@text='OK']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@id='til_job_term']]]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@text='No Preference']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@text='SELECT']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("action_post")).click();
    	Thread.sleep(5000);
    	
    	
    	
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}