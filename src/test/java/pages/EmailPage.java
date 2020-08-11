package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EmailPage extends BasePage {
    public EmailPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"email_create\"]")
    public WebElement inputField;

    @FindBy(how = How.ID, using = "SubmitCreate")
    public WebElement submitButton;

    public void NavigateTo(){
        getInputField().sendKeys(EmailGenerator.Create());
        submitButton.click();
    }

    public WebElement getInputField() {
        getWait().until(ExpectedConditions.presenceOfElementLocated(By.id("email_create")));
        return inputField;
    }
}
