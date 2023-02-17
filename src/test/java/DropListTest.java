
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import ru.yandex.practicum.MainPageScooter;

public class DropListTest {

    private WebDriver driver;

    @Test
    public void verifyTextDropElement1() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);

        objMainPageScooter.waitForLoadScooterPage();
        objMainPageScooter.clickButtonCookie();

        objMainPageScooter.scrollDownScooterPage();

        objMainPageScooter.clickDropElement1();
        objMainPageScooter.verifyTextDropElement1();

        driver.quit();

    }

    @Test
    public void verifyTextDropElement2() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);

        objMainPageScooter.waitForLoadScooterPage();
        objMainPageScooter.clickButtonCookie();

        objMainPageScooter.scrollDownScooterPage();

        objMainPageScooter.clickDropElement2();
        objMainPageScooter.verifyTextDropElement2();

        driver.quit();

    }

    @Test
    public void verifyTextDropElement3() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);

        objMainPageScooter.waitForLoadScooterPage();
        objMainPageScooter.clickButtonCookie();

        objMainPageScooter.scrollDownScooterPage();

        objMainPageScooter.clickDropElement3();
        objMainPageScooter.verifyTextDropElement3();

        driver.quit();

    }

    @Test
    public void verifyTextDropElement4() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);

        objMainPageScooter.waitForLoadScooterPage();
        objMainPageScooter.clickButtonCookie();

        objMainPageScooter.scrollDownScooterPage();

        objMainPageScooter.clickDropElement4();
        objMainPageScooter.verifyTextDropElement4();

        driver.quit();

    }

    @Test
    public void verifyTextDropElement5() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);

        objMainPageScooter.waitForLoadScooterPage();
        objMainPageScooter.clickButtonCookie();

        objMainPageScooter.scrollDownScooterPage();

        objMainPageScooter.clickDropElement5();
        objMainPageScooter.verifyTextDropElement5();

        driver.quit();

    }

    @Test
    public void verifyTextDropElement6() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);

        objMainPageScooter.waitForLoadScooterPage();
        objMainPageScooter.clickButtonCookie();

        objMainPageScooter.scrollDownScooterPage();

        objMainPageScooter.clickDropElement6();
        objMainPageScooter.verifyTextDropElement6();

        driver.quit();

    }

    @Test
    public void verifyTextDropElement7() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);

        objMainPageScooter.waitForLoadScooterPage();
        objMainPageScooter.clickButtonCookie();

        objMainPageScooter.scrollDownScooterPage();

        objMainPageScooter.clickDropElement7();
        objMainPageScooter.verifyTextDropElement7();

        driver.quit();

    }

    @Test
    public void verifyTextDropElement8() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);

        objMainPageScooter.waitForLoadScooterPage();
        objMainPageScooter.clickButtonCookie();

        objMainPageScooter.scrollDownScooterPage();

        objMainPageScooter.clickDropElement8();
        objMainPageScooter.verifyTextDropElement8();

        driver.quit();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
