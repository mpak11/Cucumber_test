package step;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;

public class Login {
    public static MainPage mainPage;
    @When("Вводим логин и пароль")
    public void loggin() {
        mainPage.logging();
    }

    @And("Нажимаем кнопку войти")
    public void enterButtonClick() {
        mainPage.clickEnterBustton();
    }

    @Then("Появилась кнопка выхода")
   public void logOutButtonIsDisplayed() {
        Assert.isTrue(mainPage.setLogOutButton(),"Проверьте данные");}

}