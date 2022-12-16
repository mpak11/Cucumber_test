package step;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;

public class BeforeStep {
    @Given("открываем сайт {string}")
    public void openWebSite(String arg0) {
        Selenide.open(arg0);
    }
}
