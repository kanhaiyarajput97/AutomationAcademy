package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class Day2 {

	@AfterTest
	public void second() {
		System.out.println("i execute last");
	}

	
	@Test
	public void second1() {
		System.out.println("seconds1");
		Assert.assertTrue(false);
	}

	@Test(groups ="kanhaiya" )
	public void second2() {
		System.out.println("seconds2");
	}

}
