package frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\Chrome Driver Windows\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		int framesize=driver.findElements(By.tagName("iframe")).size();
		List<WebElement> frm = driver.findElements(By.tagName("iframe"));
		System.out.println(frm);
		System.out.println("Number of frames in the page ="+framesize);
		driver.switchTo().frame(1);
		//driver.close();
	}

}
