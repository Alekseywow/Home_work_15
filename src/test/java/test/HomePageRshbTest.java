package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.CreditFormPage;
import page.HomePageRshb;
import page.PageOfficeAndAtms;
import page.PageSearchRegion;


@Tag("Smoke")
public class HomePageRshbTest extends TestBase{

    HomePageRshb homePageRshb = new HomePageRshb();
    CreditFormPage creditFormPage = new CreditFormPage();
    PageSearchRegion pageSearchRegion = new PageSearchRegion();
    PageOfficeAndAtms pageOfficeAndAtms = new PageOfficeAndAtms();

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
        pageSearchRegion.pageSearchRegion();


    }

    @Test
    @DisplayName("Проверка количества офисов и банкоматов в Свердловской области")
    void checkTheNumberOfficeAndAtmsInTheRegionSverdlovskTest(){
        homePageRshb.openMyPage()
                .closeCookieBannerVisible()
                .clickRegionHomePage()
                .clickSearchAndSetRegion()
                .clickOfficeAndAtmsAndCheckNumber();
        pageOfficeAndAtms.searchNumberOfficeAndAtms();

    }

    @Test
    @DisplayName("Проверка перехода на страницу Частным клиентам")
    void homePage2(){
        homePageRshb.openMyPage()
                .closeCookieBannerVisible()
                .clickMoreDetailsClientPrivate();
    }



    @Test
    @DisplayName("Проверка незаполненного кредита и вывод модальнго окна")
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
