package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final SelenideElement logginEnter = $x ("//div[@class='if-wrapper__text']/input[@name='login']");
    private final SelenideElement passwordEnter = $x ("//div[@class='if-wrapper__text']/input[@name='password']");
    private final SelenideElement enterButton = $x ("//input[@value='Войти']");
    private final SelenideElement logOutButton = $x("//a[@href='/logout/?from=%2F']");

    public void logging (){
        logginEnter.sendKeys("GremlinZloy");
        passwordEnter.sendKeys("Dfyz11091992");
        }

    public void clickEnterBustton(){
        enterButton.click();
        }
    public boolean setLogOutButton() {
        logOutButton.isDisplayed();
        return true;
    }
}