package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.annotations.DataProviderAnnotation;

public class Day3 {
	
	@BeforeSuite
	public void carloan5() {
		System.out.println("I m the first");
	}
	
	@Test(dependsOnMethods = {"carloan21","carloan2"})
	public void carloan1() {
		System.out.println("carloan1");
	}
	
	@Test(timeOut = 5000)
	public void carloan21() {
		System.out.println("kishan123");
	}

	@Test(groups ="kanhaiya" )
	public void carloan2() {
		System.out.println("carloan2");
	}
	
	@Test(enabled = false)
	public void carloan3() {
		System.out.println("carloan3");
	}
	
	@AfterSuite
	public void carloan6() {
		System.out.println("I m the last");
	}
	


}
