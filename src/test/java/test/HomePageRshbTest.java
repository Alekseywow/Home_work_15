package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.CreditFormPage;
import page.HomePageRshb;

import static com.codeborne.selenide.Selenide.sleep;

@Tag("Smoke")
public class HomePageRshbTest extends TestBase{

    HomePageRshb homePageRshb = new HomePageRshb();
    CreditFormPage creditFormPage = new CreditFormPage();

    @Test
    @DisplayName("Проверка вкладок меню при открытии страницы")
    void cheekMenuTabsTest(){
        homePageRshb.openMyPage()
                .closeCookieBannerVisible()
                .headerChips();

    }


    @Test
    @DisplayName("Проверка возможности выбора Филиала Свердловск")
    void cheekTheBranchSelectionTest(){
        homePageRshb.openMyPage()
                .closeCookieBannerVisible()
                .clickRegionHomePage()
                .clickSearchAndSetRegion();


    }

    @Test
    @DisplayName("Проверка количества офисов и банкоматов в Свердловской области")
    void checkTheNumberOfficeAndAtmsInTheRegionSverdlovskTest(){
        homePageRshb.openMyPage()
                .closeCookieBannerVisible()
                .clickRegionHomePage()
                .clickSearchAndSetRegion()
                .clickOfficeAndAtmsAndCheckNumber();
    }

    @Test
    @DisplayName("Проверка перехода на страницу Частным клиентам")
    void homePage2(){
        homePageRshb.openMyPage()
                .closeCookieBannerVisible()
                .clickMoreDetailsClientPrivate();
    }



    @Test
    @DisplayName("Проверка незаполненного кредита")
    void negativeCreditCardFillCheck(){
        homePageRshb.openMyPage()
                .closeCookieBannerVisible()
                .clickMoreDetailsClientPrivate()
                .clickOnTheSubmitCredit();
        creditFormPage.inputLastName()
                .inputLastName()
                .inputFirstName()
                .inputPhoneNumber()
                .inputEmailUser()
                .pressTheBtn()
                .modalWindowInfo();

    }

}
