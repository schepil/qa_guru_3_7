package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

    @Test
    void searchSelenide() {
        open("https://www.google.com/");
        $(byName("q")).val("Selenide").pressEnter();
        $("html").shouldHave(Condition.text("ru.selenide.org"));
    }
}
