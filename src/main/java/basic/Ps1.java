package basic;


import org.testng.annotations.Test;

public class Ps1 extends Ps {
	
	@Test
	public void login() {
		
		System.out.println("Login");
		dothis();
		
		Ps2 ps2 = new Ps2(3);
		System.out.println(ps2.increment());
		System.out.println(ps2.decriment());
		
//		Ps3 ps3 = new Ps3(5);
		System.out.println(ps2.multipalOfTwo());
		System.out.println(ps2.multipalOfThree());

		
	}
	
	

}
