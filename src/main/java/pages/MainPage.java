package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement logginEnter = $x("//div[@class='if-wrapper__text']/input[@name='login']");
    private final SelenideElement passwordEnter = $x("//div[@class='if-wrapper__text']/input[@name='password']");
    private final SelenideElement enterButton = $x("//input[@value='Войти']");
    private final SelenideElement logOutButton = $x("//a[@href='/logout/?from=%2F']");
    private final SelenideElement searchFild = $x("//*[@placeholder='Поиск по сайту']");
    private final SelenideElement searchButton = $x("//*[@value='Найти']");
    private final SelenideElement searchValue = $x("//*[@class='b-head__found']");
    private final SelenideElement mainPageNews = $x("//*[@class='section-title']");
    private final SelenideElement classButton  = $x("//a[@href='/class/']");

    public void logging() {
        logginEnter.sendKeys("GremlinZloy");
        passwordEnter.sendKeys("Dfyz11091992");
    }
    public void clickEnterButton() {
        enterButton.click();
    }

    public void clickLogoutButton(){
        logOutButton.click();
    }
    public void clickSearchButton(){
        searchButton.click();
    }
    public void clickClassButton(){
        classButton.click();
    }
    public boolean setLogOutButton() {
        logOutButton.isDisplayed();
        return true;
    }

    public boolean setLogInButton() {
        logginEnter.isDisplayed();
        return true;
    }
    public void sendKeysToSearch(){
        searchFild.sendKeys("Гоблин");
    }
    public boolean isDisplayedSearch(){
        Selenide.Wait().until(ExpectedConditions.textToBePresentInElement(searchValue, "нашёл"));
        return true;
    }
    public boolean mainPageNewsIsVisible(){
        mainPageNews.isDisplayed();
        return true;
    }

}