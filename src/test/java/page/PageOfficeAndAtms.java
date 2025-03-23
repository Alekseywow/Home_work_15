package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class PageOfficeAndAtms {

    private final SelenideElement numberOfficeAndAtms = $(".text-h2");

            public PageOfficeAndAtms searchNumberOfficeAndAtms() {
                numberOfficeAndAtms.$(byTagAndText("span","(21)"));

                return this;
            }

}
