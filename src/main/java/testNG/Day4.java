package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {

	@BeforeMethod
	public void beforeMethodEx() {
		System.out.println("It will execute before every test");
	}

	@AfterMethod
	public void afterMethodEx() {
		System.out.println("It will execute after every test");
	}

	@BeforeClass
	public void homeloan9() {
		System.out.println("before class");
	}

	@AfterClass
	public void homeloan90() {
		System.out.println("After class");
	}

	@Test(groups = "kanhaiya")
	public void homeloan1() {
		System.out.println("homeloan1");
	}

	@Test
	public void homeloan2() {
		System.out.println("homeloan2");
	}

	@Parameters({ "URL" })
	@Test
	public void homeloan3(String URL) {
		System.out.println("homeloan3 " + URL);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		// 1stSet
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		// 2ndSet
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		// 3rdSet
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		return data;

	}

}
