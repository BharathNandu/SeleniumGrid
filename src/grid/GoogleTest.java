package grid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

public class GoogleTest {
	
	@Test
	public void HomePageCheck() throws MalformedURLException, URISyntaxException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setPlatform(Platform.WIN11);
		caps.setBrowserName("chrome");
		caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.0.116:4444").toURL(),caps);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Bharath")		
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
