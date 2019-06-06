package tests;

import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.*;

public class FirstTest extends BaseTest {



    @Test
    public void firstExampleTest() throws InterruptedException {

        faceBookPage.inputEnterEmail("test@test.com");
        faceBookPage.inputEnterPassword("test");
        faceBookPage.btnClick();
        Thread.sleep(3000);

    }

    @Test
    public void secondExampleTest() throws InterruptedException {

        faceBookPage.inputEnterEmail("test@test.com");
        faceBookPage.inputEnterPassword("test");
        faceBookPage.btnClick();
        Thread.sleep(3000);

    }

}


