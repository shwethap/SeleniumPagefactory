package selenium;

	import java.util.List;

import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import dataobject.RegistratinData;


import pagefactory.RegistrationNew;



@Test
public class WebDriverTest extends SelTestCase  {
	@Test(dataProvider = "regdata", dataProviderClass=RegistratinData.class)
	 public void RegistrationTestNew(RegistratinData RegData)
	 {
		RegistrationNew reg= PageFactory.initElements(driver,RegistrationNew.class);
				driver.get("http://newtours.demoaut.com/mercuryregister.php");
		 reg.createNewUser(RegData);
			assert driver.findElement(By.tagName("body")).getText().contains(" nThank you for registering. You may now sign-in using the user name and password you've just entered.");

		 
		 
		 
	 }

	
	}


