package selenium;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeMethod 
	public void beforemethod(){
		System.out.println("prints befor every method");
	}
	@Test
	public void print1()
	{
		System.out.println("print 1");
		
	}
	@Test
	public void print2()
	{
		System.out.println("print 2");
	}

}
