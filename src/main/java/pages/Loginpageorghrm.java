package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpageorghrm {
	WebDriver driver;
	
	public Loginpageorghrm(WebDriver driver) {
	this.driver= driver;
	}

	public void entercredientialsandlogin() {
		WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		WebElement clickbutton = driver.findElement(By.id("btnLogin"));
		clickbutton.click();
	}
	public void gettitlepage() {
		String titleofpage = driver.getTitle();
		System.out.println(titleofpage);
	}
}
