package seleniumday1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;

public class AssignmentSliderBar {

	public static void main(String[] args)  {
		// TODO Auto-generated method

	System.setProperty("webdriver.gecko.driver", "C:\\selenium installations\\geckodriver.exe");
	FirefoxDriver f = new FirefoxDriver();
	f.get("https://www.snapdeal.com/");
	f.manage().window().maximize();
	f.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
	WebElement electronics = f.findElement(By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[3]/a/span[2]"));
	Actions A = new Actions(f);     // Actions work along with the webdriver so we need to specify the constructor name (f).
	A.moveToElement(electronics).build().perform();
	WebElement Fans= f.findElement(By.xpath("//*[@id=\"category3Data\"]/div[2]/div/div/p[11]/a/span"));
	A.moveToElement(Fans).click().build().perform();
	WebElement Lefttslider    = f.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]/a[1]"));
	A.dragAndDropBy(Lefttslider, 30, 0).build().perform();
	//Thread.sleep(7000);
	//WebElement Rightslider = f.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]/a[2]"));
	//A.dragAndDropBy(Rightslider, -40, 0).build().perform();
	//WebElement go =f.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[5]"));
	//A.click(go).build().perform();
	WebElement activafan = f.findElement(By.xpath("//*[@id=\"641204328237\"]/div[2]/a/picture/img"));
	A.moveToElement(activafan).click().build().perform();
	
	
	
	}

}
