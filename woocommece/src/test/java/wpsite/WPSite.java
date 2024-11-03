package wpsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class WPSite extends BaseTest{
	

	@Test(priority=0)
	public void LoginAndDarkModeInstallation() {
				
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       
        try {
        	
            // Navigate to the "Plugins" Page
            WebElement pluginsLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Plugins ']")));
            pluginsLink.click();
            
            WebElement InstalledPlugin = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Installed Plugins")));
            InstalledPlugin.click();

            List<WebElement> pluginRows = driver.findElements(By.xpath("//tr[.//strong[contains(text(), 'WP Dark Mode')]]"));
            
            if (!pluginRows.isEmpty()) {
            	driver.findElement(By.id("plugin-search-input")).sendKeys("WP Dark Mode");
                WebElement wpDarkModePlugin = pluginRows.get(0);
                
                List<WebElement> activeStatus = wpDarkModePlugin.findElements(By.xpath("//td[contains(@class, 'plugin-title')]//strong[text()='WP Dark Mode']//following-sibling::div//span[1]//a[text()='Activate']"));

                if (!activeStatus.isEmpty()) {
                	
                	System.out.println("WP Dark Mode Plugin is Inactive. Activating...");
                    WebElement activateLink =wpDarkModePlugin.findElement(By.xpath("//td[contains(@class, 'plugin-title')]//strong[text()='WP Dark Mode']//following-sibling::div//span[1]//a[text()='Activate']"));
                    activateLink.click();
                    System.out.println("WP Dark Mode Plugin Activated.");
                    
                } else { 
                	// The plugin is active
                    System.out.println("WP Dark Mode Plugin is Active.");
                    // Optionally navigate to WP Dark Mode Settings
                    WebElement settingLink =wpDarkModePlugin.findElement(By.xpath("//td[contains(@class, 'plugin-title')]//strong[text()='WP Dark Mode']//following-sibling::div//span[1]//a[text()='Settings']"));
                    settingLink.click();
                   
                }
            } else {
                System.out.println("WP Dark Mode Plugin is not installed. Installing...");

                // If the plugin is not found, install it
                driver.findElement(By.linkText("Add New Plugin")).click();
                driver.findElement(By.id("search-plugins")).sendKeys("WP Dark Mode");
//                driver.findElement(By.id("search-submit")).click();

             // Search for the WP Dark Mode plugin card and locate the "Install Now" button
                WebElement installButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='plugin-card plugin-card-wp-dark-mode']//div[2]//a[@class='install-now button']")));
                installButton.click();

                // After installation, search for the "Activate" button in the same plugin card
                WebElement activateButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='plugin-card plugin-card-wp-dark-mode']//a[text()='Activate']")));
                activateButton.click();
//
//
//
             // Optionally navigate to WP Dark Mode Settings
                WebElement settingLink = driver.findElement(By.xpath("//td[contains(@class, 'plugin-title')]//strong[text()='WP Dark Mode']//following-sibling::div//span[1]//a[text()='Settings']"));
                settingLink.click();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        } 
    }
	
}




