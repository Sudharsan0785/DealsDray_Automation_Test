package co.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_1920x1080 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver2= new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sudharsan\\Desktop\\Testing\\New folder\\geckodriver.exe");
		driver2.get("https://www.getcalley.com/page-sitemap.xml");
		int width2 = 1920;
		int height2 = 1080;
		Dimension dimension2 = new Dimension(width2, height2);
		driver2.manage().window().setSize(dimension2);
		driver2.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[1]/td[1]/a")).click();
		Thread.sleep(1000);
		driver2.navigate().back();
		driver2.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[2]/td[1]/a")).click();
		Thread.sleep(1000);
		driver2.navigate().back();
		driver2.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[3]/td[1]/a")).click();
		Thread.sleep(1000);
		driver2.navigate().back();
		driver2.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[4]/td[1]/a")).click();
		Thread.sleep(1000);
		driver2.navigate().back();
		driver2.findElement(By.xpath("//*[@id=\"sitemap\"]/tbody/tr[5]/td[1]/a")).click();
	}

}
