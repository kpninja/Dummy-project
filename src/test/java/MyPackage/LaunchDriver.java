package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("Web.chrome.driver","C:\\Users\\myhome\\eclipse-workspace\\SDET128-millenium\\src\\test\\resources\\drivers\\chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.numpyninja.com/contact");
	
	WebElement firstNametxtBox=(WebElement) driver.findElements(By.id("first-name"));
	firstNametxtBox.sendKeys("Kavita");
	
	WebElement lastNametxtBox=(WebElement) driver.findElements(By.id("last-name"));
	lastNametxtBox.sendKeys("Patil");
	
	 ((WebElement) driver.findElements(By.name("email"))).sendKeys("kpatil83@gmail.com");
	 
	 ((WebElement) driver.findElements(By.name("phone"))).sendKeys("9977383767");
	 driver.findElement(By.id("textarea_comp-l1c0ku07")).sendKeys("when next SDET batch will start?");
	}

}
