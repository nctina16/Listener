import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Main {
    public static void main(String[] args){
       WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);

        Listener listen = new Listener();
        eventDriver.register(listen);
        eventDriver.get("http://automationpractice.com/index.php");
        eventDriver.findElement(By.linkText("Sign in")).click();

        driver.quit();
    }
}
