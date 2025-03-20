package page;

import com.codeborne.selenide.SelenideElement;
import data.TestData;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CreditFormPage {

    private final SelenideElement setlastName = $("[aria-label='Фамилия*']"),
                                setFirstName = $("[aria-label='Имя*']"),
                                setPhoneNumber = $("[aria-label='Телефон*']"),
                                setEmailUser = $("[aria-label='Электронная почта*']"),
                                clickSubmitBtn = $("[type='submit']"),
                                seeModalWindow = $("[title='Диалог']");



    TestData testData = new TestData();


    @Step("Ввести Фамилию")
    public CreditFormPage inputLastName(){
        setlastName.setValue(testData.lastName);

        return this;
    }

    @Step("Ввести Имя")
    public CreditFormPage inputFirstName() {
        setFirstName.setValue(testData.firstName);

        return this;
    }

    @Step("Ввести номер телефона")
    public CreditFormPage inputPhoneNumber() {
        setPhoneNumber.setValue(testData.setNumber);

        return this;
    }

    @Step("Ввести Email")
    public CreditFormPage inputEmailUser() {
        setEmailUser.setValue(testData.userEmail);

        return this;
    }

    @Step("Нажать на кнопку Оформить")
    public CreditFormPage pressTheBtn() {
        clickSubmitBtn.doubleClick();

        return this;
    }

    @Step("Появилось модальное окно")
    public CreditFormPage modalWindowInfo() {
        seeModalWindow.shouldBe(visible);

        return this;
    }
}
