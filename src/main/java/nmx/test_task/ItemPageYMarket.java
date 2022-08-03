package nmx.test_task;
import static com.codeborne.selenide.Condition.attribute;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.time.Duration;
import io.qameta.allure.Step;

public class ItemPageYMarket {

    //страница выбранного товара

    //загаловок названия товара
    @FindBy(how = How.XPATH,using = ".//div[1]/div[1]/h1")
    private SelenideElement headerItemName;

    //метод получения текста названия товара
    @Step("Получение текста наименования товара на странице товара")
    public String getHeaderItemText() {
        return headerItemName.getText();
    }


}
