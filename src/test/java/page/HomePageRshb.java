package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;


import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.TypeOptions.text;

public class HomePageRshb {
    private final SelenideElement
            cookieBanner = $(".shadow-main-black");



    private final ElementsCollection headerMenu = $$(".pb-xs [role='menuitem']");



    @Step("Открыть страницу")
    public HomePageRshb openMyPage() {
        open("https://www.rshb.ru/");

        return this;
    }
    @Step("Закрыть баннер")
    public HomePageRshb closeCookieBannerVisible() {
        sleep(6000);
        if (cookieBanner.exists()) {
            cookieBanner.$(".justify-center").click();
        }
        return this;
    }

    @Step("Вкладки на главной странице в header")
    public HomePageRshb headerChips() {
        headerMenu.shouldHave(texts("Частным клиентам", "Бизнесу", "Агробизнесу", "Экосистема Своё", "О Банке"));

        return this;
    }

}
