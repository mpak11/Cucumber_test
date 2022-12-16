package step;

import com.codeborne.selenide.SelenideElement;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.codeborne.selenide.Selenide.$x;

public class LogOut {
    private final SelenideElement enterButton = $x ("//input[@value='Войти']");

    private final SelenideElement logOutButton = $x("//a[@href='/logout/?from=%2F']");
    @When("Нажимаем кнопку выход")
    public void clickLogOutButton () {
        logOutButton.click();
    }

    @Then("Появляется кнопка войти")
    public void logInButtonIsDisplayed() {
        Assert.isTrue(enterButton.isDisplayed(), "Проверьте работоспособность кноки 'Выход'");
    }
}
