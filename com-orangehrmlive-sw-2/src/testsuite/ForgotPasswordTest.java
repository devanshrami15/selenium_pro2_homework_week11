package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Base64;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        //click on the ‘Forgot your password’ link
        WebElement forgotpassworsfield = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));

        String expectedErrorMessage = "Please enter your username to identify your account to reset your password\n";

        String actualErrorMessage = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-card-note orangehrm-forgot-password-card-note']")).getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);

    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
