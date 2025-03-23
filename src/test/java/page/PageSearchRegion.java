package page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class PageSearchRegion {

    private final SelenideElement
            searchNamePage = $(".text-h2");

    @Step("Проверка наименования филиала")
    public PageSearchRegion pageSearchRegion() {
        searchNamePage.shouldHave(text("Свердловский региональный филиал"));

        return this;
    }

}




