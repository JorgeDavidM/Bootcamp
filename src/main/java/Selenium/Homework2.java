package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JM00895463\\Documents\\Projects\\Practise\\src\\main\\resources\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.findElement(By.name("name")).sendKeys("Jorge Muñoz");
		driver.findElement(By.name("email")).sendKeys("jorge@hotmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("abc123");
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(0);
		driver.findElement(By.xpath("//input[@id='inlineRadio2']")).click();
		driver.findElement(By.name("bday")).sendKeys("10/09/2022");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		driver.close();
		
	}

}
