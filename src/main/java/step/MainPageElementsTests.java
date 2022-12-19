package step;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ClassPage;
import pages.MainPage;
import pages.SearchPage;

public class MainPageElementsTests {
    public static MainPage mainPage = new MainPage();
    public static SearchPage searchPage = new SearchPage();
    public static ClassPage classPage = new ClassPage();


    @And("Вводим данные в поле поиска")
    public void inputValueToSearch() {
        mainPage.sendKeysToSearch();
    }

    @And("Нажимаем кнопку поиск")
    public void searchButtonClick() {
        mainPage.clickSearchButton();
    }

    @Then("Сравниваем результат")
    public void isDisplayedSearchValue() {
        Assert.isTrue(mainPage.isDisplayedSearch(), "Проверьте параметры поиска");
    }

    @And("Нажимаем на кнопку Главная")
    public void mainPageReturn() {
        searchPage.mainPageButtonClick();
    }

    @Then("Отображаются новости сайта")
    public void mainPageNewIsDisplayed() {
        Assert.isTrue(mainPage.mainPageNewsIsVisible(),"Проверьте работоспособность кнопки Главная");
    }

    @And("Нажимаем на кнопку Классы")
    public void classesButtonClick() {
        mainPage.clickClassButton();
    }

    @And("Проверяем что открылась страница со списком классов")
    public void checkClassesList() {
        Assert.isTrue(classPage.checkClassListIsDisplayed(), "Проверьте страницу Классов");
    }
}
