package step;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;

public class LogOut {
    public static MainPage mainPage = new MainPage();

    @When("Нажимаем кнопку выход")
    public void clickLogOutButton () {
        mainPage.clickLogoutButton();
    }

    @Then("Появляется кнопка войти")
    public void logInButtonIsDisplayed() {
        Assert.isTrue(mainPage.setLogInButton(), "Проверьте работоспособность кноки 'Выход'");
    }
}
