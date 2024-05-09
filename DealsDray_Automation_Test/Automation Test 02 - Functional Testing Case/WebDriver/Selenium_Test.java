package co.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudharsan\\Desktop\\Testing\\New folder\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://demo.dealsdray.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("mui-1")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.id("mui-2")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/form/div[3]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[1]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/a/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div[2]/button")).click();
		driver.findElement(By.id("mui-7")).sendKeys("C:\\Users\\Sudharsan\\Downloads\\New folder\\demo-data.xlsx");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/button")).click();
	}

}
