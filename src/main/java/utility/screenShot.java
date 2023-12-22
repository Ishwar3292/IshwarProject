package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShot {
	
	public static void clickScreenShot(WebDriver driver,String name) throws IOException {
	
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination =new File("E:\\Automation\\Facebook\\screenShot\\"+name+".png");
		
		FileHandler.copy(source, destination);
	}

}
