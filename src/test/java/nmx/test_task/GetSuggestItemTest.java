package nmx.test_task;
import com.codeborne.selenide.Configuration;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.CoreMatchers.containsString;
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.Description;
import nmx.test_task.MainPageYMarket;

public class GetSuggestItemTest {

    MainPageYandex mainPage = page(MainPageYandex.class);

    @Before
    public void setBrowser() {
        //открытие главной страницы сервиса в браузере и переход к форме заказа
        Configuration.browser = "chrome";
        open("https://yandex.ru/");
        mainPage.clickCloseButton();
    }

    @Test
    public void testOrderDataFirstSet () {
        //первая часть теста, где проверяется получения рекомендаций к введенному тесту запроса
        mainPage.clickYMarketButton();

    }

}
