package wpsite;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DarkModeTest extends BaseTest {

    @Test
    public void testEnableAdminDarkMode() {
        
        // Enable Admin Dark Mode
        AdminDashboardPage adminDashboard = new AdminDashboardPage(driver);
        adminDashboard.enableAdminDarkMode();
        
        
    }
    @Test
    public void validateDarkModeOnAdminDashboard() {
    	
    	
    	WebElement LightToDark = driver.findElement(By.xpath("//div//div[@class='_track wp-dark-mode-ignore']//span[contains(text(),'Light')]"));
    	LightToDark.click();
    	
    	WebElement bodyElement = driver.findElement(By.tagName("body"));        
        
        String backgroundColor = bodyElement.getCssValue("background-color");
        Assert.assertEquals(backgroundColor, "rgba(43, 45, 45, 1)", "Dark mode background color is correct");
    }
    
    @Test
    public void changeFloatingSwitchStyle(){
    	
    	 driver.findElement(By.xpath("//div[text()='WP Dark Mode']")).click(); // Navigate to WP Dark Mode menu item

         driver.findElement(By.xpath("//h4[text()='Customization']")).click();
         
         driver.findElement(By.xpath("//a[text()='Switch Settings']")).click();
                  

         WebElement switchStyleElement = driver.findElement(By.xpath("//div[@class='wp-dark-mode-ignore wp-dark-mode-switch ignore dummy wp-dark-mode-switch-20   dummy opacity-60 pointer-events-none']"));
         switchStyleElement.click();
         

         // Save changes
         driver.findElement(By.id("save-settings")).click();
    }
    
}
