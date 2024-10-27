package woocommece;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AdminDashboardPage {
	
    private WebDriver driver;

    
   
 // Locator for WP Dark Mode menu item
    private By wpDarkModeMenu = By.xpath("//div[contains(text(),'WP Dark Mode')]");
    private By settings = By.xpath("//li[contains(text(),'WP Dark Mode')]/following-sibling::li/a[contains(text(),'Settings')]"); 
    private By adminPanelDarkMode= By.xpath("//div//a[contains(text(),'Admin Panel Dark Mode')]");

    private By adminPanelDarkModeToggle = By.xpath("//div//div[@class='relative w-10 h-full rounded-full transition duration-100 bg-slate-200']//span[@class='w-5 h-5 flex rounded-full mt-0.5 ml-0.5 transition duration-100 border-4 border-white bg-slate-200']");
    private By saveChangesButton = By.xpath("//div[@class='save-buttons z-[10]']//button[2]");
    
    public AdminDashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enableAdminDarkMode() {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Click on "WP Dark Mode" in the menu
        wait.until(ExpectedConditions.elementToBeClickable(wpDarkModeMenu)).click();

        // Click on "Settings"
        wait.until(ExpectedConditions.elementToBeClickable(settings)).click();

        // Click on "Admin Panel Dark Mode"
        wait.until(ExpectedConditions.elementToBeClickable(adminPanelDarkMode)).click();

        // Enable the "Admin Panel Dark Mode" option
        wait.until(ExpectedConditions.elementToBeClickable(adminPanelDarkModeToggle)).click();

        WebElement saveButton = wait.until(ExpectedConditions.visibilityOfElementLocated(saveChangesButton));
        if (saveButton.isDisplayed() && saveButton.isEnabled()) {
            saveButton.click();
        } else {
            System.out.println("Save Changes button is not clickable.");
        }
        
       
    }
    
    
}
