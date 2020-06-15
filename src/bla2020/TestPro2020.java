package bla2020;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestPro2020 {

	@Test
	public void openBrowser () throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahfuj Tuhin\\eclipse-workspace\\BatchMarch2020\\jars\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		java.util.List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		
		System.out.println(frame.size());
		
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"draggable\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"droppable\"]")).getText());
		
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	    WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	    
	    Actions act=new Actions(driver);
	    Thread.sleep(3000);
	    act.dragAndDrop(drag, drop).build().perform();

	}

}
