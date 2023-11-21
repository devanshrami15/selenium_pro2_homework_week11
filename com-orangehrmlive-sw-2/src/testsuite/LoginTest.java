package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() throws InterruptedException {

        //Enter “Admin” username
        WebElement userNameField = driver.findElement(By.xpath("//input[@name='username']"));
        userNameField.sendKeys("Admin");

        //Enter “admin123 password
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys("admin123");

        //Click on ‘LOGIN’ button
        WebElement loginField = driver.findElement(By.xpath("//button[@type='submit']"));
        loginField.click();

        //Verify the ‘Dashboard’ text is display
        Thread.sleep(5000);
        WebElement dashboardElement = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
        dashboardElement.isDisplayed();
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
