import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Nested Frames")).click();

		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-middle");

		System.out.println(driver.findElement(By.id("content")).getText());
		
		driver.quit();

	}

}