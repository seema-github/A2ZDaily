package app.a2zdaily;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Login 
{

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
	DesiredCapabilities dc=new DesiredCapabilities();

	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");

	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");

	dc.setCapability(MobileCapabilityType.APPLICATION_NAME, "Android");

	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");

	dc.setCapability("appPackage", "com.eqanim.eqanim.tech");
	dc.setCapability("appActivity", "com.eqanim.eqanim.tech.MainActivity");

	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	AndroidDriver<WebElement> driver= new AndroidDriver<WebElement> (url,dc);

	Thread.sleep(5000);

	Thread.sleep(5000);

	//driver.findElement(By.xpath("//android.widget.ImageView[@content-desc = 'Search']")).click();

	driver.findElement(By.xpath("//android.widget.EditText[@index = '0']")).click();

	WebElement mobno= driver.findElement(By.xpath("//android.widget.EditText[@index = '0']"));  // mobile number
	mobno.sendKeys("8830549747");

	Thread.sleep(3000);

	driver.findElement(By.xpath("//android.widget.Button[@text = 'Send OTP ']")).click();  // send otp

	Thread.sleep(7000);


	driver.findElements(By.xpath("//android.widget.EditText[@index = '0']")).get(1).sendKeys("1234");
	Thread.sleep(3000);

	driver.findElement(By.xpath("//android.widget.Button[@text = 'Sign In ']")).click();

	}
}


