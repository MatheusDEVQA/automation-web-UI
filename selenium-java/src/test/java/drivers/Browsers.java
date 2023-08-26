package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {

    WebDriver drive;

    @Test
    public void abriBrowser(){
        WebDriverManager.chromedriver().setup();
        drive = new ChromeDriver();
        drive.manage().window().maximize();
        drive.get("https://ultimateqa.com/automation/");

    }
}
