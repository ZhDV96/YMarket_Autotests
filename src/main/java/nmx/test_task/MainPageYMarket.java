package nmx.test_task;
import static com.codeborne.selenide.Condition.attribute;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.time.Duration;
import io.qameta.allure.Step;

public class MainPageYMarket extends MainPageYandex {

    //главная страница Яндекс Маркет

    //локатор поля ввода наименования товара
    @FindBy(how = How.XPATH,using = ".//div[2]/div/div/form/div/div/div/div[2]/input")
    private SelenideElement itemNameField;

    //локатор второго товара в списке рекомендаций
    @FindBy(how = How.XPATH, using = ".//div[2]/ul/li[11]")
    private SelenideElement secondItem;


    //метод заполнения поля ввода наименования товара
    @Step("Ввод наименования товара в строке поиска")
    public void setItemName(String name) {
        itemNameField.setValue(name);
    }

    //метод выбора второго товара в списке
    @Step("Клик по второму товару в раскрывшемся списке")
    public void clickSecondItem() {
        secondItem.click();
    }

    //*метод объединяющий заполнение поля наименования товара
    //и переход на его страницу
    @Step("Заполнение поля ввода и переход на странцу товара")
    public void selectItem(String name) {
        setItemName(name);
        clickSecondItem();
    }


}
