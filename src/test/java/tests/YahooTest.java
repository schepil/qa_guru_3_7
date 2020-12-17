package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YahooTest {
    @Test
    void selenideSearchTest() {
        // Открыть Yahooo
        open("https://ru.search.yahoo.com");

        // Ввести Selenide в поиск
        $("#yschsp").setValue("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(Condition.text("selenide.org"));
    }
}
