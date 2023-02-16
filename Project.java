package org.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Paramesh\\DailyTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement table = driver.findElement(By.cssSelector("#customers"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		WebElement r = row.get(1);
		List<WebElement> data = r.findElements(By.tagName("td"));
		WebElement td = data.get(2);
	    System.out.println(td.getText());

	}

}
