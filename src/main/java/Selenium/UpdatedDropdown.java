package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JM00895463\\Documents\\Projects\\Practise\\src\\main\\resources\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		Thread.sleep(1000);
		int i=1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}		
		driver.findElement(By.id("btnclosepaxoption")).click();
		//Check the quantity of adults selected
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("#divpaxinfo")).getText(),"5 Adult");
		Thread.sleep(1000);
		
		//Check if the check box is selected or not
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=\"SeniorCitizenDiscount\"]")).isSelected());
		driver.findElement(By.cssSelector("input[id*=\"SeniorCitizenDiscount\"]")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=\"SeniorCitizenDiscount\"]")).isSelected());
		
		//Count the number of check boxes
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		//Validate the attribute of an element, (Opacity)
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("It's enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		
		
		driver.close();
		
		
		
	}

}
