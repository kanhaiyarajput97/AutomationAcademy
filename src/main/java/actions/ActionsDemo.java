package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		WebElement selecter1 = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(selecter1).contextClick().build().perform();
		
		WebElement selecter2 = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		a.moveToElement(selecter2).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();


	}

}
