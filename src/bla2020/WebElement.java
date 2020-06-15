package bla2020;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahfuj Tuhin\\eclipse-workspace\\BatchMarch2020\\jars\\chromedriver_win32\\chromedriver.exe");
					
					
					WebDriver driver=new ChromeDriver();
					driver.get("https://www.dsebd.org/");
					driver.manage().window().maximize();
					
					
					WebElement ty=driver.findElement(By.xpath("//*[@id='bvoluem']/div/table/tbody"));
					
					List<WebElement> trl = ty.findElements(By.tagName("tr"));
					System.out.println(trl.size());
			 for (int i = 1; i < trl.size(); i++) {
				 List<WebElement> tdl = trl.get(i).findElements(By.tagName("td"));
				 for (int j = 1; j < tdl.size(); j++) {
					 System.out.println(tdl.get(j).getText());
				
	}

}
