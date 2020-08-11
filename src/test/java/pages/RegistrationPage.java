package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how= How.CSS, using = ".radio-inline")
    public List<WebElement> radioButtonGender;

    @FindBy(how = How.ID, using = "customer_firstname")
    public WebElement inputFieldFirstName;

    @FindBy(how = How.ID, using = "customer_lastname")
    public WebElement inputFieldLastName;

    @FindBy(how = How.ID, using = "passwd")
    public WebElement inputFieldPassword;

    @FindBy(how = How.ID, using = "days")
    public WebElement selectFieldDays;

    @FindBy(how = How.ID, using = "months")
    public WebElement selectFieldMonths;

    @FindBy(how = How.ID, using = "years")
    public WebElement selectFieldYears;

    @FindBy(how = How.ID, using = "firstname")
    public WebElement getInputFieldFirstNameAddress;

    @FindBy(how = How.ID, using = "lastname")
    public WebElement getInputFieldLastNameAddress;

    @FindBy(how = How.ID, using = "company")
    public WebElement getInputFieldCompanyName;

    @FindBy(how = How.ID, using = "address1")
    public WebElement getInputFieldCompanyAddress;

    @FindBy(how = How.ID, using = "city")
    public WebElement getInputFieldCity;

    @FindBy(how = How.ID, using = "id_state")
    public WebElement selectStateName;

    @FindBy(how = How.ID, using = "postcode")
    public WebElement inputFieldZipCode;

    @FindBy(how = How.ID, using = "phone_mobile")
    public WebElement inputFieldPhoneNumber;

    @FindBy(how = How.ID, using = "alias")
    public WebElement inputFieldAlias;

    @FindBy(how = How.ID, using = "submitAccount")
    public WebElement submitButton;

    public void FillForm(Person person){

   radioButtonGender.get(0).click();
   inputFieldFirstName.sendKeys(person.getFirstName());
   inputFieldLastName.sendKeys(person.getLastName());
   inputFieldPassword.sendKeys(person.getPassword());

   Select days = new Select(selectFieldDays);
   days.selectByValue(person.getDayBirth().toString());
   Select months = new Select(selectFieldMonths);
   months.selectByIndex(person.getMonthBirth());
   Select years = new Select(selectFieldYears);
   years.selectByValue(person.getYearBirth().toString());

//   getInputFieldFirstNameAddress.sendKeys(person.getAddressFirstName());
//   getInputFieldLastNameAddress.sendKeys(person.getAddressLastName());
   getInputFieldCompanyName.sendKeys(person.getCompanyName());
   getInputFieldCompanyAddress.sendKeys(person.getAddress());
   getInputFieldCity.sendKeys(person.getCity());
   inputFieldZipCode.sendKeys(person.getZipCode());
   Select stateName = new Select(selectStateName);
   stateName.selectByIndex(person.getState());
   inputFieldPhoneNumber.sendKeys(person.getPhone());
   inputFieldAlias.sendKeys(person.getAlias());

   submitButton.click();
    }
}
