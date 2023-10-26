package week6.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeaftap {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.get("http://leaftaps.com/opentaps/control/login");
	     driver.manage().window().maximize();
	     driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	     driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	     driver.findElement(By.className("decorativeSubmit")).click();
	     
	     
	     String text=driver.findElement(By.tagName("h2")).getText();
	     System.out.println(text);
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     
	     
	     driver.findElement(By.linkText("Leads")).click();
	     driver.findElement(By.linkText("Merge Leads")).click();
	     driver.findElement(By.xpath("//span[text()='From Lead']/following::img")).click();
	     Set<String> childWindow = driver.getWindowHandles();
	     List<String> OpenWindow = new ArrayList<String>(childWindow);
	     driver.switchTo().window(OpenWindow.get(1));
	    
	     driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/following::a")).click();
	     driver.switchTo().window(OpenWindow.get(0));
	     driver.findElement(By.xpath("//span[@class='requiredField']/following::img[2]")).click();
	     Set<String> childWindow1 = driver.getWindowHandles();
	     List<String> OpenWindow1=new ArrayList<String>(childWindow1);
	     driver.switchTo().window(OpenWindow1.get(1));
	     driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/following::a[12]")).click();
	     driver.switchTo().window(OpenWindow1.get(0));
	     driver.findElement(By.xpath("//a[text()='Merge']")).click();
	     driver.switchTo().alert().accept();
	     }

}
