package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class FirstTest {

    private WebDriver driver = null;
    private ChromeOptions chromeOptions = null;

    @Test
    public void firsExampleTest()
    {

        System.setProperty("webdriver.chrome.driver" , "C:\\Program Files\\chromedriver.exe");

        chromeOptions = new ChromeOptions();

        driver = new ChromeDriver(chromeOptions);

        driver.navigate().to("http://www.google.com");



        driver.quit();

    }

}
