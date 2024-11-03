package wpsite;
import io.github.cdimascio.dotenv.Dotenv;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BaseTest {
	
    WebDriver driver;
    Dotenv dotenv = Dotenv.load();
    
	@BeforeTest
    public void setUp() {
    	
    	  WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	      driver.get("http://localhost/wordpress/wp-login.php?");
	      driver.manage().window().maximize();
	      
	      String username = dotenv.get("USERNAME");
	      String password = dotenv.get("PASSWORD");
	      
	     // Log in to the AdminDashboard
	        driver.findElement(By.id("user_login")).sendKeys("username");
	        driver.findElement(By.id("user_pass")).sendKeys("password"); 
	        driver.findElement(By.id("wp-submit")).click();
	   
    }
    
    @AfterTest
    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
    }
}
