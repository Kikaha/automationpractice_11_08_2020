package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH,using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    public WebElement singInButton;

    public void NavigateTo(){
        singInButton.click();
    }
}
