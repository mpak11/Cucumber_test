package Step;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$x;

public class MaimPageElementsTests {
    private final SelenideElement searchFild = $x("//*[@placeholder='Поиск по сайту']");
    private final SelenideElement searchButton = $x("//*[@value='Найти']");
    private final SelenideElement searchValue = $x("//*[@class='b-head__found']");
    private final SelenideElement mainPageButton = $x("//*[@class='menu menu-main']/li[1]");
    private final SelenideElement mainPageNews = $x("//*[@class='section-title']");
    private final SelenideElement classButton  = $x("//a[@href='/class/']");
    private final SelenideElement classList  = $x("//div[@id='classes']");

    @And("Вводим данные в поле поиска")
    public void inputValueToSearch() {
        searchFild.sendKeys("Гоблин");
    }

    @And("Нажимаем кнопку поиск")
    public void searchButtonClick() {
        searchButton.click();
    }

    @Then("Сравниваем результат")
    public void isDisplayedSearchValue() {
        Selenide.Wait().until(ExpectedConditions.textToBePresentInElement(searchValue, "нашёл"));
        Assert.isTrue(searchValue.isDisplayed(), "Проверьте параметры поиска");
    }

    @And("Нажимаем на кнопку Главная")
    public void mainPageButtonClick() {
        mainPageButton.click();
    }

    @Then("Отображаются новости сайта")
    public void mainPageNewIsDisplayed() {
        Assert.isTrue(mainPageNews.isDisplayed(),"Проверьте работоспособность кнопки Главная");
    }

    @And("Нажимаем на кнопку Классы")
    public void classesButtonClick() {
        classButton.click();
    }

    @And("Проверяем что открылась страница со списком классов")
    public void checkClassesList() {
        Assert.isTrue(classList.isDisplayed(), "Проверьте страницу Классов");
    }
}
