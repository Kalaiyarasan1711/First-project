package Mini_Project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Booking {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Automation\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Kalai1711");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("Adactin");
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select area = new Select(location);
		area.selectByVisibleText("London");
		WebElement rooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select room_no = new Select(rooms);
		room_no.selectByIndex(4);
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		WebElement button = driver.findElement(By.xpath("//input[@name='radiobutton_4']"));
		button.click();
		WebElement click = driver.findElement(By.id("continue"));
		click.click();
		
		WebElement fname = driver.findElement(By.name("first_name"));
		fname.sendKeys("KALAI");
		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys("K");
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("Chennai-600075");
		WebElement cardno = driver.findElement(By.xpath("//input[@name='cc_num']"));
		cardno.sendKeys("1111555577779999");
		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select type = new Select(cardtype);
		type.selectByVisibleText("VISA");
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select mon = new Select(month);
		mon.selectByIndex(11);
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select yr = new Select(year);
		yr.selectByValue("2020");
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("777");
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		
		Thread.sleep(5000);
		
		WebElement logout = driver.findElement(By.xpath("//input[@name='logout']"));
		logout.click();
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Selenium_Automation\\Screenshots\\adactin.png");
		FileHandler.copy(src, dest);
		
		
		
		
		
		
		
		
		


		
		
		
		
		
	
		
		

		
		
		
		
	}

}
