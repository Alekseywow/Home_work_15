package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;


import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;


public class HomePageRshb {
    private final SelenideElement
            cookieBanner = $(".shadow-main-black"),
            pressRegion = $(".text-ellipsis"),
            getSearch = $(".undefined"),
            setCity = $("#search-bar-input"),
            clickAndRegion = $("[href='/branches/sverdlovsk']"),
            searchName = $(".text-h2"),
            clickOfficeAndAtms = $(".ml-auto"),
            numberOfficeAndAtms = $(".text-h2"),
            hoverDetailsPrivate = $(".ease-out"),
            clickDetailsPrivate = $(".basis-full"),
            clickButtonSubmit = $("[href='https://www.rshb.ru/natural/loans/all-goals#zayavka']");







    private final ElementsCollection headerMenu = $$(".whitespace-nowrap [role='menuitem']");





    @Step("Открыть страницу")
    public HomePageRshb openMyPage() {
        open("");

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

    @Step("Нажать на главной странице в header регион")
    public HomePageRshb clickRegionHomePage() {
        pressRegion.click();

        return this;
    }

    @Step("Нажать на строку поиска и ввести Свердловский")
    public HomePageRshb clickSearchAndSetRegion(){
        getSearch.click();
        setCity.setValue("свердловский");
        clickAndRegion.click();
        searchName.shouldHave(text("Свердловский региональный филиал"));


        return this;
    }

    @Step("Кликнуть Офисы и банкоматы и убедиться в их количестве ")
    public HomePageRshb clickOfficeAndAtmsAndCheckNumber() {
        clickOfficeAndAtms.$$("a").get(1).click();
        numberOfficeAndAtms.$(byTagAndText("span","(21)"));

        return this;
    }

    @Step("Нажать кнопку Подробнее для страницы Частным клиентам ")
    public HomePageRshb clickMoreDetailsClientPrivate() {
        hoverDetailsPrivate.$$("div").first().hover();
        clickDetailsPrivate.click();

        return this;
    }
    @Step("Нажать на кнопку Оформить")
    public HomePageRshb clickOnTheSubmitCredit(){
        clickButtonSubmit.scrollTo().click();

        return this;
    }




}
