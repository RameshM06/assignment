package week7.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MatrimonyAutomate {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.tamilmatrimony.in/");
	     driver.manage().window().maximize();
	     WebElement findElement = driver.findElement(By.xpath("//select[@name='REGISTERED_BY']"));
	     driver.findElement(By.xpath("//option[text()='Myself']")).click();
	     driver.findElement(By.id("NAME")).sendKeys("Ramesh M");
	     driver.findElement(By.xpath("//input[@value='M']")).click();
	     WebElement findElement2 = driver.findElement(By.xpath("//select[@id='DOBDAY']"));
	     driver.findElement(By.xpath("//option[@value='6']")).click();
	     WebElement findElement3 = driver.findElement(By.xpath("//select[@name='DOBMONTH']"));
	     driver.findElement(By.xpath("//option[text()='Apr']")).click();
	     WebElement findElement4 = driver.findElement(By.xpath("//select[@name='DOBYEAR']"));
	     driver.findElement(By.xpath("//option[text()='2000']")).click();
	     driver.findElement(By.id("RELIGION")).click();
	     driver.findElement(By.xpath("//option[text()='Hindu']")).click();
	     driver.findElement(By.id("MOTHERTONGUE")).click();
	     driver.findElement(By.xpath("//option[text()='Tamil']")).click();
	     WebElement findElement5 = driver.findElement(By.id("COUNTRY"));
	     driver.findElement(By.xpath("//option[text()='India']")).click();
	     driver.findElement(By.id("MOBILENO")).sendKeys("7358505462");
	     driver.findElement(By.id("EMAIL")).sendKeys("rameshm06@myyahoo.com");
	     driver.findElement(By.name("PASSWD1")).sendKeys("Rame$h6");
	     driver.close();
	}

}
