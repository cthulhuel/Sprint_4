package ru.yandex.practicum;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPageScooter {

    private WebDriver driver;

    private By buttonCookie = By.className("App_CookieButton__3cvqF");
    private By sectionQuestions = By.className("Home_SubHeader__zwi_E");
    private By dropElement1 = By.xpath("//*[@id='accordion__heading-0']");
    private By dropElement2 = By.xpath("//*[@id='accordion__heading-1']");
    private By dropElement3 = By.xpath("//*[@id='accordion__heading-2']");
    private By dropElement4 = By.xpath("//*[@id='accordion__heading-3']");
    private By dropElement5 = By.xpath("//*[@id='accordion__heading-4']");
    private By dropElement6 = By.xpath("//*[@id='accordion__heading-5']");
    private By dropElement7 = By.xpath("//*[@id='accordion__heading-6']");
    private By dropElement8 = By.xpath("//*[@id='accordion__heading-7']");

    private By textDropElement1 = By.xpath("//*[@class='accordion__panel' and @id='accordion__panel-0']");
    private By textDropElement2 = By.xpath("//*[@class='accordion__panel' and @id='accordion__panel-1']");
    private By textDropElement3 = By.xpath("//*[@class='accordion__panel' and @id='accordion__panel-2']");
    private By textDropElement4 = By.xpath("//*[@class='accordion__panel' and @id='accordion__panel-3']");
    private By textDropElement5 = By.xpath("//*[@class='accordion__panel' and @id='accordion__panel-4']");
    private By textDropElement6 = By.xpath("//*[@class='accordion__panel' and @id='accordion__panel-5']");
    private By textDropElement7 = By.xpath("//*[@class='accordion__panel' and @id='accordion__panel-6']");
    private By textDropElement8 = By.xpath("//*[@class='accordion__panel' and @id='accordion__panel-7']");

    public MainPageScooter(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForLoadScooterPage() {
        new WebDriverWait(driver, 10).until(driver -> (driver.findElement(sectionQuestions).getText() != null));
    }

    public void clickButtonCookie() {
        driver.findElement(buttonCookie).click();
    }

    public void scrollDownScooterPage() {
        driver.findElement(dropElement8);
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)", "");
    }

    public void clickDropElement1() {
        driver.findElement(dropElement1).click();
        new WebDriverWait(driver, 1).until(driver -> (driver.findElement(textDropElement1).getText() != null));
    }

    public void clickDropElement2() {
        driver.findElement(dropElement2).click();
        new WebDriverWait(driver, 1).until(driver -> (driver.findElement(textDropElement2).getText() != null));
    }

    public void clickDropElement3() {
        driver.findElement(dropElement3).click();
        new WebDriverWait(driver, 1).until(driver -> (driver.findElement(textDropElement3).getText() != null));
    }

    public void clickDropElement4() {
        driver.findElement(dropElement4).click();
        new WebDriverWait(driver, 1).until(driver -> (driver.findElement(textDropElement4).getText() != null));
    }

    public void clickDropElement5() {
        driver.findElement(dropElement5).click();
        new WebDriverWait(driver, 1).until(driver -> (driver.findElement(textDropElement5).getText() != null));
    }

    public void clickDropElement6() {
        driver.findElement(dropElement6).click();
        new WebDriverWait(driver, 1).until(driver -> (driver.findElement(textDropElement6).getText() != null));
    }

    public void clickDropElement7() {
        driver.findElement(dropElement7).click();
        new WebDriverWait(driver, 1).until(driver -> (driver.findElement(textDropElement7).getText() != null));
    }

    public void clickDropElement8() {
        driver.findElement(dropElement8).click();
        new WebDriverWait(driver, 1).until(driver -> (driver.findElement(textDropElement8).getText() != null));
    }

    public void verifyTextDropElement1() {
        String ActualText1 = driver.findElement(textDropElement1).getText();
        Assert.assertEquals("Текст не соответствует ожидаемому результату", TestData.EXPECTED_TEXT_1, ActualText1);
    }

    public void verifyTextDropElement2() {
        String ActualText2 = driver.findElement(textDropElement2).getText();
        Assert.assertEquals("Текст не соответствует ожидаемому результату", TestData.EXPECTED_TEXT_2, ActualText2);
    }

    public void verifyTextDropElement3() {
        String ActualText3 = driver.findElement(textDropElement3).getText();
        Assert.assertEquals("Текст не соответствует ожидаемому результату", TestData.EXPECTED_TEXT_3, ActualText3);
    }

    public void verifyTextDropElement4() {
        String ActualText4 = driver.findElement(textDropElement4).getText();
        Assert.assertEquals("Текст не соответствует ожидаемому результату", TestData.EXPECTED_TEXT_4, ActualText4);
    }

    public void verifyTextDropElement5() {
        String ActualText5 = driver.findElement(textDropElement5).getText();
        Assert.assertEquals("Текст не соответствует ожидаемому результату", TestData.EXPECTED_TEXT_5, ActualText5);
    }

    public void verifyTextDropElement6() {
        String ActualText6 = driver.findElement(textDropElement6).getText();
        Assert.assertEquals("Текст не соответствует ожидаемому результату", TestData.EXPECTED_TEXT_6, ActualText6);
    }

    public void verifyTextDropElement7() {
        String ActualText7 = driver.findElement(textDropElement7).getText();
        Assert.assertEquals("Текст не соответствует ожидаемому результату", TestData.EXPECTED_TEXT_7, ActualText7);
    }

    public void verifyTextDropElement8() {
        String ActualText8 = driver.findElement(textDropElement8).getText();
        Assert.assertEquals("Текст не соответствует ожидаемому результату", TestData.EXPECTED_TEXT_8, ActualText8);
    }

}