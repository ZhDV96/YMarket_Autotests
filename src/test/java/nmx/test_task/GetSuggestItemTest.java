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

public class GetSuggestItemTest {

    //создание экземпляра главной страницы
    MainPageYandex mainPage = page(MainPageYandex.class);

    @Before
    public void setBrowser() {
        //*открытие главной страницы Яндекс в браузере,
        //закрытие модельных окон и поп-апов в случае появления
        //переход на страницу Яндекс Маркет по кнопке
        Configuration.browser = "chrome";
        open("https://yandex.ru/");
        mainPage.clickCloseButton();
        mainPage.clickYMarketButton();
    }

    //*ввод наименования товара в поисковой строке,
    //переход на страницу выбранного товара и проверка корректности рекомендации
    //для первого набора данных
    @DisplayName("Поиск товара 'Чёрное платье' через поисковую строку Яндекс Маркет для первого набора данных")
    @Description("Тест, проверяющий корректность получения рекомендаций по запросу для первого набора данных")
    @Test
    public void testOrderDataFirstSet () {
        //первая часть теста с поиском товара и переходом на его станицу
        MainPageYMarket mainPageYMarket = page(MainPageYMarket.class);
        mainPageYMarket.selectItem("Чёрное платье");
        //вторая часть текста с проверкой корректности полученной рекомендации
        ItemPageYMarket itemPageYMarket = page(ItemPageYMarket.class);
        String actualText = itemPageYMarket.getHeaderItemText().toLowerCase();
        String expectedText = "черное";
        MatcherAssert.assertThat(actualText, containsString(expectedText));

    }

    //*ввод наименования товара в поисковой строке,
    //переход на страницу выбранного товара и проверка корректности рекомендации
    //для второго набора данных
    @DisplayName("Поиск товара 'Черное платье' через поисковую строку Яндекс Маркет для первого набора данных")
    @Description("Тест, проверяющий корректность получения рекомендаций по запросу для первого набора данных")
    @Test
    public void testOrderDataSecondSet () {
        //первая часть теста с поиском товара и переходом на его станицу
        MainPageYMarket mainPageYMarket = page(MainPageYMarket.class);
        mainPageYMarket.selectItem("Черное платье");
        //вторая часть текста с проверкой корректности полученной рекомендации
        ItemPageYMarket itemPageYMarket = page(ItemPageYMarket.class);
        String actualText = itemPageYMarket.getHeaderItemText().toLowerCase();
        String expectedText = "черное";
        MatcherAssert.assertThat(actualText, containsString(expectedText));

    }

    @After
    public void teardown() {
        // Закрытие браузера в случае некорректной отработки автозакрытия бразуера Selenide
        closeWindow();
    }

}
