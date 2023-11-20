package week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UibankAutomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	     driver.get("https://uibank.uipath.com/register-account");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("firstName")).sendKeys("Ramesh");
	     driver.findElement(By.name("middleName")).sendKeys("M");
	     WebElement findElement = driver.findElement(By.name("gender"));
	     driver.findElement(By.xpath("//option[text()='Male']")).click();
	     WebElement findElement1 = driver.findElement(By.id("title"));
	     Select dropDown = new Select(findElement1);
	     dropDown.selectByVisibleText("Mr"); 
	     WebElement findElement2 = driver.findElement(By.id("employmentStatus"));
	     Select dropDown1 = new Select(findElement2);
	     dropDown1.selectByVisibleText(" Unemployed");
	     driver.findElement(By.id("age")).sendKeys("06/04/2003");
	     driver.findElement(By.name("username")).sendKeys("Ramesh M");
	     driver.findElement(By.name("email")).sendKeys("rameshm06@myyahoo.com");
	     driver.findElement(By.id("password")).sendKeys("Rame$h6");
	     driver.close();
	     
	}

}
