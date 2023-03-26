package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class AssignmentNykaa {

	public static void main(String[] args) {
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--disable-notifications");
		EdgeDriver driver=new EdgeDriver(options);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
		WebElement Bran = driver.findElement(By.xpath("//a[contains(text(),'brands')]"));
		Actions Builder=new Actions(driver);
		Builder.moveToElement(Bran).perform();
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).click();
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//a[text()='categories']")).click();
		driver.findElement(By.xpath("//a[text()='hair']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list1=new ArrayList <String>(windowHandles);
		driver.switchTo().window(list1.get(1));
		driver.findElement(By.xpath("//a[text()='hair care']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> list2=new ArrayList <String>(windowHandles2);
		driver.switchTo().window(list2.get(2));
		driver.findElement(By.xpath("(//a[text()='Shampoo'])[1]")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> list3=new ArrayList <String>(windowHandles3);
		driver.switchTo().window(list3.get(3));
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.findElement(By.xpath("//div[contains(text(),'Protect Shampoo')]")).click();
		Set<String> windowHandles4 = driver.getWindowHandles();
	    List<String> list4=new ArrayList<String> (windowHandles4);
	    driver.switchTo().window(list4.get(4));
	    driver.findElement(By.xpath("//span[text()='180ml']")).click();
	    String text = driver.findElement(By.xpath("(//span[text()='₹209'])[1]")).getText();
	    System.out.println(text);
	    driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
	    driver.findElement(By.xpath("(//*[name()='svg' and @fill='none'])[6]")).click();
	    driver.switchTo().frame(0);
	    String text2 = driver.findElement(By.xpath("//span[text()='₹279']")).getText();
	    System.out.println(text2);
	    driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
	    driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	    driver.quit();
		
		

	}

}
