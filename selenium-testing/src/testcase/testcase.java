package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hurrahome.com/account/login");
		WebElement link;
		driver.findElement(By.name("email")).sendKeys("senecastudentproject+ryan@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("HurraHomeTest");
	    driver.findElement(By.tagName("button")).click();
	    Thread.sleep(5000);
	    driver.quit();
	}
}
