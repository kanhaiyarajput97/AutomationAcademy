package basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ps {
	
	@Test
	public void loginTry() {
		
		System.out.println("LoginTry");
	}
	
	@BeforeMethod
	public void runningfirst() {
		
		System.out.println("i m running first");
	}
	
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("i execute last");
	}
	
	public void dothis() {
		
		System.out.println("Do This");
	}

}
