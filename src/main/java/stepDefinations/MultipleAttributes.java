package webDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleAttributes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
   driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");
	Select opts=new Select(driver.findElement(By.id("cars")));
	opts.selectByIndex(0);
	opts.selectByValue("saab");
	opts.selectByVisibleText("Audi");
	driver.findElement(By.xpath("/html/body/form/input")).click();
	Thread.sleep(5000);
	String SelCars=driver.findElement(By.xpath("/html/body/div[1]")).getText();
	System.out.println("Selected Cars="+SelCars);
	driver.quit();
}


}
