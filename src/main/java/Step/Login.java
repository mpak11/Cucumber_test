package Step;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$x;

public class Login {

    private final SelenideElement logginEnter = $x ("//div[@class='block-4']/input[@name='login']");
    private final SelenideElement passwordEnter = $x ("//div[@class='block-4']/input[@name='password']");
    private final SelenideElement enterButton = $x ("//input[@value='Войти']");

    private final SelenideElement logOutButton = $x("//a[@href='/logout/?from=%2F']");
    @When("Вводим логин и пароль")
    public void loggin() {
        logginEnter.sendKeys("GremlinZloy");
        passwordEnter.sendKeys("Dfyz11091992");
    }

    @And("Нажимаем кнопку войти")
    public void enterButtonClick() {
        enterButton.click();
    }

    @Then("Появилась кнопка выхода")
    public void logOutButtonIsDisplayed() {
        Assert.isTrue(logOutButton.isDisplayed(), "Проверьте данные");
    }
}
