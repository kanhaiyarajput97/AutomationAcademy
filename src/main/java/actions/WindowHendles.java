package actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHendles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentId=it.next();
		String childId=it.next();
		
		
		driver.switchTo().window(childId);
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector("p[class='im-para red']")).getText());
		String fullText=driver.findElement(By.cssSelector("p[class='im-para red']")).getText();
		String emailId = fullText.split(" ")[4];
		System.out.println(emailId);
		driver.switchTo().window(parentId);
		
		driver.findElement(By.id("username")).sendKeys(emailId);

	}

}
