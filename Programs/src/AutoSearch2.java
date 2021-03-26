import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class AutoSearch2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.cssSelector("input [id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input [id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input [id*='SeniorCitizenDiscount']")).isSelected());
		
		driver.findElements(By.cssSelector("input[type='checkbox']")).size();
	
	}

}
