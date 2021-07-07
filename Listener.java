import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Listener extends AbstractWebDriverEventListener {
  public void beforeClickOn(WebElement element, WebDriver driver){

        //downcast the driver to access TakesScreenshot method
        TakesScreenshot ts = (TakesScreenshot)driver;

        //capture screenshot as output type FILE
        File file = ts.getScreenshotAs(OutputType.FILE);

        try {
            //save the screenshot taken in destination path
            FileUtils.copyFile(file, new File("nivetha.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The screenshot is taken");

        //wait for the page to load
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }
}
