import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstAutomation {
    static WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void myTest1() {
        String baseURL = "http://www.google.com";
        driver.get(baseURL);
    }

    @Test
    public void myTest2(){
        String baseUrl = "http://www.youtube.com";
        driver.get(baseUrl);
    }

    @After
    public void tearDown(){
        driver.quit();
    }


}
