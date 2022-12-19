package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ClassPage {
    private final SelenideElement classList  = $x("//div[@id='classes']");

    public boolean checkClassListIsDisplayed(){
        classList.isDisplayed();
        return true;
    }
}
