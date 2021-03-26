import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearPass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.clearpassdev.io");
		driver.findElement(By.cssSelector("input[id='inputphone']")).sendKeys("8668111168");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='password']")).click();
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Test@2345");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
		
	}

}
