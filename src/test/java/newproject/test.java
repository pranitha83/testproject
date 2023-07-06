package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	static WebDriver driver;
	public void driversetup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return;
	}
	public void webpage() {
		driver.get("https://google.com");
	}
	public static void main(String[] args) {
		test t1=new test();
		t1.driversetup();
		t1.webpage();
	}
}
