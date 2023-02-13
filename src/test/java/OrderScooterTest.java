
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import ru.yandex.practicum.MainPageScooter;
import ru.yandex.practicum.OrderPageScooter;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class OrderScooterTest {

    private final String Name;
    private final String Surname;;
    private final String Address;
    private final String Station;
    private final String Phone;
    private final String Time;
    private final String Period;
    private final String Color;

    public OrderScooterTest (
            String Name,
            String Surname,
            String Address,
            String Station,
            String Phone,
            String Time,
            String Period,
            String Color
    )
    {
        this.Name = Name;
        this.Surname = Surname;
        this.Address = Address;
        this.Station = Station;
        this.Phone = Phone;
        this.Time = Time;
        this.Period = Period;
        this.Color = Color;
    }

    @Parameterized.Parameters
    public static Object[][] enterData() {
        return new Object[][] {
                { "Женя", "Ел", "Москва", "Черкизовская", "88007770000", "Choose суббота, 11-е февраля 2023 г.", "сутки", "black"},
                { "Таня", "Ду", "Ростов", "Отрадное", "88005000001", "Choose воскресенье, 12-е февраля 2023 г.", "трое суток", "grey"},
        };
    }

        private WebDriver driver;

    @Test
    public void OrderScooterTest() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

        MainPageScooter objMainPageScooter = new MainPageScooter(driver);

        OrderPageScooter objOrderPageScooter = new OrderPageScooter(driver);
        objMainPageScooter.clickButtonCookie();
        objOrderPageScooter.clickButtonOrder();
        objOrderPageScooter.enterName(Name);
        objOrderPageScooter.enterSurname(Surname);
        objOrderPageScooter.enterAddress(Address);
        objOrderPageScooter.enterStation(Station);
        objOrderPageScooter.enterPhone(Phone);
        objOrderPageScooter.clickButtonOrderNext();
        objOrderPageScooter.enterTimeDelivery(Time);
        objOrderPageScooter.enterRentalPeriod(Period);
        objOrderPageScooter.clickScooterColor(Color);
        objOrderPageScooter.clickButtonOrderFinal();
        objOrderPageScooter.clickButtonYesOrderModal();

        driver.quit();

    }

}
