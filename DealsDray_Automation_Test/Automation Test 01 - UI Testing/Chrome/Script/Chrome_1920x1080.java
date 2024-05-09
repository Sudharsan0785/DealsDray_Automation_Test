package co.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_1920x1080 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudharsan\\Desktop\\Testing\\New folder\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		int width1 = 1920;
		int height1 = 1080;
		Dimension dimension1 = new Dimension(width1, height1);
		driver.manage().window().setSize(dimension1);
		driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[1]/td[1]/a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[2]/td[1]/a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[3]/td[1]/a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[4]/td[1]/a")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[5]/td[1]/a")).click();

	}

}
