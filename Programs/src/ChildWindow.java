import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
	    driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> S =driver.getWindowHandles();
		Iterator<String> it=S.iterator();
		String parentWindow=it.next();
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		driver.switchTo().window(parentWindow);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		}

}