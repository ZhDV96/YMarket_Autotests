package nmx.test_task;
import static com.codeborne.selenide.Condition.attribute;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.time.Duration;
import io.qameta.allure.Step;

public class MainPageYandex {

    //главная страница
    //локатор кнопки авторизации в хэдере
    @FindBy(how = How.XPATH,using = ".//div[text()='Сделайте Яндекс главной страницей']")
    private SelenideElement modalWindow;
    //локатор кнопки авторизации в футере
    @FindBy(how = How.XPATH, using = ".//div[4]/div/div/div/div/div[5]")
    private SelenideElement modalWindowClose;
    //локатор панели "Булки" выбора ингредиентов раздела "Конструктор"
    @FindBy(how = How.XPATH, using = ".//ul/li[3]/a/div[1]")
    private SelenideElement YMarketButton;

    //метод поля соглашения cookie
    public void clickCloseButton() {
        if (modalWindow.exists()) {
            modalWindowClose.click();
        }
    }

    //метод клика по кнопке заказа в шапке сайта
    public void clickYMarketButton() {
        YMarketButton.click();
    }

}
