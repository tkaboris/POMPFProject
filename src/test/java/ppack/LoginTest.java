package ppack;

import ObjectResository.LoginPage;
import ObjectResository.MyAccountPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
//https://www.youtube.com/watch?v=KVwq-k3icIA
public class LoginTest {

    WebDriver driver;

    @Test
    public void login() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// we will pass driver from this page to LoginPage  by using constructor
        driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");

        // to access, you have to create object of the class
        LoginPage loginPage = new LoginPage(driver);
        loginPage.emailField().sendKeys("arun.selenium@gmail.com");
        loginPage.passwordField().sendKeys("Second@123");
        loginPage.loginButton().click();

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        Assert.assertTrue(myAccountPage.accountBreadCrumb().isDisplayed());
        Thread.sleep(300);
    }
    @AfterMethod
    public void closure(){
        driver.close();
    }
}
