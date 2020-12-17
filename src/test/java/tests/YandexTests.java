package tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class YandexTests {

     @Test
    void selenideSearchTest() {
        // Открыть Yandex
        open("https://yandex.ru");

        // Ввести Selenide в поиск
        $("#text").setValue("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(Condition.text("selenide.org"));
    }
}
