package webDriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vindeep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ArrayList<String> exp_data=new ArrayList<String>();
		exp_data.add("Days");
		exp_data.add("Months");
		exp_data.add("Years");
       WebDriver driver=new ChromeDriver();
       driver.get("https://vindeep.com/Calculators/FDCalc.aspx");
       driver.manage().window().maximize();
       String title=driver.getTitle();
       System.out.println("Title="+title);
       if (title.equals("Fixed Deposit Calculator | Calculate FD Interest, Maturity value"))
       
       {
    	   System.out.println("Title matched..");
    	   driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).clear();
    	   driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).sendKeys("200000");
    	   driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).clear();
    	   driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).sendKeys("70");
    	   //FD Period Drop down box
    	   WebElement ele=driver.findElement(By.id("ContentPlaceHolder1_cphCentre_PeriodDropDown"));
    	   Select opts=new Select(ele);
    	   opts.selectByVisibleText("Days");
    	   List<WebElement>allItems=opts.getOptions();
    	   System.out.println("Total numbers of items in FD period="+allItems.size());
    	   for (int i=0;i<allItems.size();i++)
    	   {
			System.out.println(allItems.get(i).getText());
    		if (exp_data.get(i).equals(allItems.get(i).getText()))
    		{
    			
    			System.out.println("Item matched..");
    		}else
    		{
    			System.out.println("Item not matched..");
    		}
    	   }
    	   driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).clear();   	    	   
    	   driver.findElement(By.id("ContentPlaceHolder1_cphCentre_InterestRate")).sendKeys("5.50"); 	
    	   driver.findElement(By.id("ContentPlaceHolder1_cphCentre_btnFDMAmount")).click();
    	   Thread.sleep(5000);
    	   String fd_amount=driver.findElement(By.id("ContentPlaceHolder1_cphCentre_MaturityAmountTextBox")).getAttribute("Value");    	   
      	   System.out.println("FD Amount="+fd_amount);              
	}else
       {   
       System.out.println("Title not matched");
	}
      driver.quit();
	}
}
