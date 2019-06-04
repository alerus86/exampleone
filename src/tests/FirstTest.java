package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;

import static base.Settings.*;


public class FirstTest {

    @FindBy(id = "email")
    public WebElement inputEmail;

    @FindBy (id = "pass")
    public WebElement inputPass;

    @FindBy (xpath  = "//input[@value='Log In']")
    public WebElement buttonLogIn;

    private WebDriver driver = null;
    private ChromeOptions chromeOptions = null;

    @BeforeSuite

    public void setup() {
        System.setProperty("webdriver.chrome.driver" , RESOURCES + CHROMEDRIVER);
        chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);

    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

    @BeforeMethod
    public void navigateToBaseUrl(){
        driver.navigate().to(BASE_URL);
    }

    @Test
    public void firstExampleTest() throws InterruptedException {

        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.id("pass")).sendKeys("test");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        Thread.sleep(3000);

    }

    @Test
    public void secondExampleTest() throws InterruptedException {

        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.id("pass")).sendKeys("test");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        Thread.sleep(3000);

    }

}
