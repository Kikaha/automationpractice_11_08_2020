package pages;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class startUp {

    private WebDriver driver;

    private static String accountCreatePage = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private static String registrationPage = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
    private static String registeredAccount = "http://automationpractice.com/index.php?controller=my-account";
    private HomePage homePage;
    private EmailPage emailPage;
    private RegistrationPage registrationPage1;

    //The interConnection between tests is just with demo/navigation purpose

    @Before
    public void testInit(){
        String pathChrome = "C:\\Users\\Nukem\\Desktop\\selenium_Java\\automationpractice_11_08_2020\\chromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",pathChrome);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.navigate().to("http://automationpractice.com/index.php");
    }

    @Test
    public void shouldNavigateToAccountCreatePage(){
      homePage = new HomePage(driver);
      PageFactory.initElements(driver, homePage);
      homePage.NavigateTo();
        Assert.assertEquals(driver.getCurrentUrl(),accountCreatePage);
        System.out.println();
    }

    @Test
    public void shouldNavigateToRegistrationPage(){
        shouldNavigateToAccountCreatePage();
        emailPage = new EmailPage(driver);
        PageFactory.initElements(driver, emailPage);
        emailPage.NavigateTo();
//        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
//        new WebDriverWait(driver,15)
//                .until(x->((JavascriptExecutor)x).executeScript("return document.readyState").equals("complete"));
        new WebDriverWait(driver,5).until(ExpectedConditions.urlToBe(registrationPage));
        Assert.assertEquals(registrationPage,driver.getCurrentUrl());
          System.out.println();
    }

    @Test
    public void shouldFillRegistrationForm(){
        shouldNavigateToRegistrationPage();
        registrationPage1 = new RegistrationPage(driver);
        PageFactory.initElements(driver, registrationPage1);
        registrationPage1.FillForm(PersonFactory.createPerson());
        new WebDriverWait(driver,5).until(ExpectedConditions.urlToBe(registeredAccount));
        Assert.assertEquals(registeredAccount,driver.getCurrentUrl());
        System.out.println();
    }

}
