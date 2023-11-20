package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomate {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.linkText("Create new account")).click();
	     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ramesh");
	     driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M");
	     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7358505462");
	     driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Rame$h6");
	     driver.findElement(By.xpath("//select[@name='birthday_day']")).click();
	     driver.findElement(By.xpath("//option[@value='6']")).click();
	     driver.findElement(By.xpath("//select[@name='birthday_month']")).click();
	     driver.findElement(By.xpath("//option[text()='Apr']")).click();
	     driver.findElement(By.xpath("//select[@name='birthday_year']")).click();
	     driver.findElement(By.xpath("//option[text()='2018']")).click();
	     driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
	     driver.close();
	     
	}

}
