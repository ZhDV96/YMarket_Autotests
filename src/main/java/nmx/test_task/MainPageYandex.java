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

    //главная страница Яндекс

    //локатор модального окна с предложением установить браузер Яндекс
    @FindBy(how = How.XPATH,using = ".//div[text()='Сделайте Яндекс главной страницей']")
    private SelenideElement modalWindow;

    //локатор кнопки отказа модального окна с предложением установить браузер Яндекс
    @FindBy(how = How.XPATH, using = ".//div[3]/div/div/div/div/div[@class='modal__close']")
    private SelenideElement modalWindowClose;

    //локатор кнопки Яндекс Маркет
    @FindBy(how = How.XPATH, using = ".//ul/li[3]/a/div[1]")
    private SelenideElement YMarketButton;

    //локатор окна с предложением получить купон
    @FindBy(how = How.XPATH,using = ".//div/h2[text()='Каждый день вас ждёт купон!']")
    private SelenideElement popupCouponWindow;

    //локатор кнопки закрытия окна с предложением получить купон
    @FindBy(how = How.XPATH, using = ".//div[16]/div/div[2]/div/div[1]")
    private SelenideElement popupCouponWindowClose;


    //метод отказа от установки браузера
    @Step("Закрытие окна с предложением установить Яндекс браузер")
    public void clickCloseButton() {
        if (modalWindow.exists()) {
            modalWindowClose.click();
        }
    }

    //метод отказа от купона
    @Step("Закрытие окна с предложением получить купон на скидку")
    public void clickClosePanel() {
        if (popupCouponWindow.exists()) {
            popupCouponWindowClose.click();
        }
    }

    //метод клика по кнопке для перехода на главную страницу Яндекс Маркет
    @Step("Клик по кнопке Яндекс Маркет для переход на главную страницу магазина")
    public void clickYMarketButton() {
        YMarketButton.click();
    }

}
