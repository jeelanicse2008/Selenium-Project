import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2E {

	private static WebElement StaticDropdwon;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-default ui-state-highlight ui-state-active")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for (int i=1;i<5;i++) {
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
			break;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(StaticDropdwon);
		dropdown.selectByVisibleText("USD");
		driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
