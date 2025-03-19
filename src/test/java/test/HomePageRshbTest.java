package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.HomePageRshb;

public class HomePageRshbTest extends TestBase{

    HomePageRshb homePageRshb = new HomePageRshb();

    @Test
    @DisplayName("Проверка вкладок меню при открытии страницы")
    void homePage3(){
        homePageRshb.openMyPage()
                .closeCookieBannerVisible()
                .headerChips();

    }


    @Test
    @DisplayName("Проверка возможности выбора Филиала Свердловск")
    void homePage(){

    }

    @Test
    @DisplayName("Проверка количества банкоматов в Свердловской области")
    void homePage1(){

    }

    @Test
    @DisplayName("Проверика перехода на страницу ")
    void homePage2(){

    }


    @Test
    @DisplayName("Проверка перехода на страницу ")
    void homePage4(){

    }

    @Test
    @DisplayName("Проверка неудачного заполнения кредитной карты")
    void homePage5(){

    }

}
