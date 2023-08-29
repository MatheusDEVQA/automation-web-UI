package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

    public static WebDriver drive;


    public void abrirBrowser() {
        WebDriverManager.firefoxdriver().setup();
        drive = new FirefoxDriver();
        drive.manage().window().maximize();
        drive.get("https://ultimateqa.com/automation/");

    }


    public void fecharNavegador(){
        drive.quit();
    }
}
