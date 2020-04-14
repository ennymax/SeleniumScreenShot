package EnnymaxQA.EnnymaxQA;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenSHOT1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
	//	public static void main(String[] args) throws Exception
		{
					
			// This section gets the chrome driver and lunches the chrome browser with my specified url
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\CONFIRMZ\\eclipse-workspace\\EnnymaxQA\\target\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("https://www.jobberman.com/customer/sign-up/");
					
					// This section of code maximize the window
					driver.manage().window().maximize();
					
		// this section takes a screen shot and saves the file in a specified folder
		File screen_shot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
		FileUtils.copyFile(screen_shot, new File("C:\\Users\\CONFIRMZ\\Downloads", "TestScreenshot.jpg"));
		System.out.println("the screen shot has been saved");
		 } 
		catch (IOException e)
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
		
		
	    Thread.sleep(30000);

	}

}}
