package ObjectResository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    WebDriver driver;

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//ul[@class='breadcrumb']//a[text()='Account']")
    private WebElement accountBreadCrumb;


    public WebElement accountBreadCrumb() {
        return accountBreadCrumb;
    }
}
