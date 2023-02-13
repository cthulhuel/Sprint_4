package ru.yandex.practicum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPageScooter {

    private WebDriver driver;

    private By buttonOrder = By.className("Button_Button__ra12g");
    private By buttonOrderNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By buttonOrderFinal =  By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By buttonYesPopupOrderModal =  By.xpath(".//button[text()='Да']");
    private By fieldName = By.xpath(".//input[@placeholder='* Имя']");
    private By fieldSurname = By.xpath(".//input[@placeholder='* Фамилия']");
    private By fieldAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By fieldStationList = By.xpath(".//div[@class='select-search__value']");
    private By fieldPhone =  By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By fieldTimeDelivery =  By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private By fieldRentalPeriod =  By.xpath(".//div[@class='Dropdown-placeholder']");


    public OrderPageScooter(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonOrder () {
        driver.findElement(buttonOrder).click();
    }

    public void enterName (String Name) {
        new WebDriverWait(driver, 3);
        driver.findElement(fieldName).click();
        driver.findElement(fieldName).sendKeys(Name);
    }

    public void enterSurname (String Surname) {
        new WebDriverWait(driver, 3);
        driver.findElement(fieldSurname).click();
        driver.findElement(fieldSurname).sendKeys(Surname);
    }

    public void enterAddress (String Address) {
        new WebDriverWait(driver, 3);
        driver.findElement(fieldAddress).click();
        driver.findElement(fieldAddress).sendKeys(Address);
    }

    public void enterStation (String Station) {
        new WebDriverWait(driver, 3);
        driver.findElement(fieldStationList).click();
        new WebDriverWait(driver, 5);
        driver.findElement(By.xpath(".//div[text()='" + Station + "']")).click();
    }

    public void enterPhone (String Phone) {
        new WebDriverWait(driver, 3);
        driver.findElement(fieldPhone).click();
        driver.findElement(fieldPhone).sendKeys(Phone);
    }

    public void clickButtonOrderNext () {
        driver.findElement(buttonOrderNext).click();
    }

    public void enterTimeDelivery (String Time) {
        new WebDriverWait(driver, 3);
        driver.findElement(fieldTimeDelivery).click();
        new WebDriverWait(driver, 3);
        driver.findElement(By.xpath(".//div[@aria-label='" + Time + "']")).click();
    }

    public void enterRentalPeriod (String Period) {
        new WebDriverWait(driver, 3);
        driver.findElement(fieldRentalPeriod).click();
        new WebDriverWait(driver, 3);
        driver.findElement(By.xpath(".//div[text()='" + Period + "']")).click();
    }

    public void clickScooterColor (String Color) {
        driver.findElement(By.xpath(".//input[@id='" + Color + "']")).click();
    }

    public void clickButtonOrderFinal () {
        driver.findElement(buttonOrderFinal).click();
    }

    public void clickButtonYesOrderModal () {
        driver.findElement(buttonYesPopupOrderModal).click();
    }

}