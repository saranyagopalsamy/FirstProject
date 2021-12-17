package demo;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
public class firsttestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("chrome execution on Windows!!");
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");

//System.setProperty("webdriver.edge.driver", "C:\\Program Files\\chromedriver_win32\\msedgedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://demoqa.com");

driver.quit();
System.out.println("Execution complete on Windows");



	}

}
