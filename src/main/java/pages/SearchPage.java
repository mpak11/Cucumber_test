package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {
    private final SelenideElement mainPageButton = $x("//*[@class='menu menu-main']/li[1]");

    public void mainPageButtonClick() {
        mainPageButton.click();
    }
}
