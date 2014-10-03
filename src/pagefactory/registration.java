package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import selenium.Util;
public class registration {
	WebDriver driver;
	
	public registration(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public returnPageObject TestRegistration(WebDriver driver)
		{
		driver.findElement(By.name("firstName")).sendKeys("shwetha");
		driver.findElement(By.name("lastName")).sendKeys("Gowda");
		driver.findElement(By.name("phone")).sendKeys("98098");
		driver.findElement(By.name("address1")).sendKeys("vijaynagar");
		driver.findElement(By.name("city")).sendKeys("BANGALORE");
		driver.findElement(By.name("state")).sendKeys("Karanataka");
		driver.findElement(By.name("email")).sendKeys("shwetha");
		new Select(driver.findElement(By.name("country"))).selectByVisibleText("INDIA");
		driver.findElement(By.name("password")).sendKeys("Gowda");
		driver.findElement(By.name("confirmPassword")).sendKeys("Gowda");
		driver.findElement(By.name("register")).click();
		return new returnPageObject(driver);
		
	}

}
