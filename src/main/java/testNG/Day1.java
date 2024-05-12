package testNG;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	@Test(groups ="kanhaiya" )
	public void first() {
		
		System.out.println("hello");
		Assert.assertTrue(true);
	}

	@BeforeTest
	public void second() {
		System.out.println("i execute first");
	}
}
