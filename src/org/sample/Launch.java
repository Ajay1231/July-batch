package org.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium1\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
String url = driver.getCurrentUrl();
System.out.println(url);
String ti = driver.getTitle();
System.out.println(ti);
WebElement user = driver.findElement(By.id("email"));
user.sendKeys("ajay123");
WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("SocailMedia001@");
	}
	}
