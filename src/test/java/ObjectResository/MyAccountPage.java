package ObjectResository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
    WebDriver driver;

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
    }

    private By accountBreadCrumb = By.xpath("//ul[@class='breadcrumb']//a[text()='Account']");

    public WebElement accountBreadCrumb() {
        return driver.findElement(accountBreadCrumb);
    }
}
