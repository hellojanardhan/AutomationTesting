package automationtesting;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(file,new File("C:\\Users\\Janardhan\\OneDrive\\Pictures\\Screenshots\\amazonScreenShot.jpg"));
		System.out.println("Successfully capture the screenshot");
		
		driver.quit();
	}
}
