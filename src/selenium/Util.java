package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends SelTestCase {
	
	public void navigate(String url)
	{
		driver.get(url);
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public List<WebElement> getlinks()
	{
		
		List<WebElement> anchorList=driver.findElements(By.tagName("a"));
		for(WebElement element:anchorList)
		{
						System.out.println(element.getText());
		}
		return anchorList;
	}
	
	public void clicklinks(List<WebElement> anchorList) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, 10000);
		for(WebElement links:anchorList)
		{
			System.out.println(links.getText());
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(links.getText())));
		   	driver.findElement(By.partialLinkText(links.getText())).click();
			Thread.sleep(5000);
			
		}
	}

}
