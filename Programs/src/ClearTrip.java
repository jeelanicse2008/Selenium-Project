import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
		
		
		WebElement StaticDropdwon = driver.findElement(By.id("Adults"));
		Select dropdown = new Select(StaticDropdwon);
		dropdown.selectByValue("4");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//Childrens
		WebElement StaticDropdwon1 = driver.findElement(By.id("Childrens"));
		Select dropdown1 = new Select(StaticDropdwon1);
		dropdown1.selectByValue("2");
		System.out.println(dropdown1.getFirstSelectedOption().getText());
	
		//MoreOptionsLink
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Jeelani");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	
	}

}
