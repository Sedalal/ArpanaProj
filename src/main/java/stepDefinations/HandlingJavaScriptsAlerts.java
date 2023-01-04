package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaScriptsAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		   driver.manage().window().maximize();
			driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		driver.switchTo().alert().sendKeys("Riya");
		driver.switchTo().alert().accept();
		driver.quit();
		
	}

}
