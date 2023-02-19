
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import ru.yandex.practicum.MainPageScooter;

public class DropListTest {

    private WebDriver driver;

    @Before
    public void waitAndScrollPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPageScooter objMainPageScooter = new MainPageScooter(driver);
        objMainPageScooter.waitForLoadScooterPage();
        objMainPageScooter.clickButtonCookie();
        objMainPageScooter.scrollDownScooterPage();
    }

    @Test
    public void verifyTextDropElement1() {

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);
        objMainPageScooter.clickDropElement1();
        objMainPageScooter.verifyTextDropElement1();

    }

    @Test
    public void verifyTextDropElement2() {

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);
        objMainPageScooter.clickDropElement2();
        objMainPageScooter.verifyTextDropElement2();

    }

    @Test
    public void verifyTextDropElement3() {

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);
        objMainPageScooter.clickDropElement3();
        objMainPageScooter.verifyTextDropElement3();

    }

    @Test
    public void verifyTextDropElement4() {

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);
        objMainPageScooter.clickDropElement4();
        objMainPageScooter.verifyTextDropElement4();

    }

    @Test
    public void verifyTextDropElement5() {

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);
        objMainPageScooter.clickDropElement5();
        objMainPageScooter.verifyTextDropElement5();

    }

    @Test
    public void verifyTextDropElement6() {

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);
        objMainPageScooter.clickDropElement6();
        objMainPageScooter.verifyTextDropElement6();

    }

    @Test
    public void verifyTextDropElement7() {

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);
        objMainPageScooter.clickDropElement7();
        objMainPageScooter.verifyTextDropElement7();

    }

    @Test
    public void verifyTextDropElement8() {

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);
        objMainPageScooter.clickDropElement8();
        objMainPageScooter.verifyTextDropElement8();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
