
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import ru.yandex.practicum.MainPageScooter;

public class DropListTest {

    private WebDriver driver;

    @Test
    public void verifyDropList() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);

        objMainPageScooter.waitForLoadScooterPage();
        objMainPageScooter.clickButtonCookie();

        objMainPageScooter.scrollDownScooterPage();

        objMainPageScooter.clickDropElement1();
        objMainPageScooter.verifyTextDropElement1();

        objMainPageScooter.clickDropElement2();
        objMainPageScooter.verifyTextDropElement2();

        objMainPageScooter.clickDropElement3();
        objMainPageScooter.verifyTextDropElement3();

        objMainPageScooter.clickDropElement4();
        objMainPageScooter.verifyTextDropElement4();

        objMainPageScooter.clickDropElement5();
        objMainPageScooter.verifyTextDropElement5();

        objMainPageScooter.clickDropElement6();
        objMainPageScooter.verifyTextDropElement6();

        objMainPageScooter.clickDropElement7();
        objMainPageScooter.verifyTextDropElement7();

        objMainPageScooter.clickDropElement8();
        objMainPageScooter.verifyTextDropElement8();

        driver.quit();

    }

}
