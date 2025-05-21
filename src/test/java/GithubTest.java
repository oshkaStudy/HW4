import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class GithubTest {

    @BeforeAll
    public static void setupConfig() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    public void checkSoftAssertsPageAndJunitCodeExampleAreAvailable() {

        String junitCode = "ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}";

        // - Откройте страницу Selenide в Github
        open("/selenide/selenide");

        // - Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();

        // - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("div.markdown-body").shouldHave(text("Soft assertions"));

        // - Откройте страницу SoftAssertions
        $(byTagAndText("a", "Soft assertions")).click();

        //проверьте что внутри есть пример кода для JUnit5
        $(byTagAndText("h4", "3. Using JUnit5 extend test class:"))
                .parent().sibling(0).$("pre")
                .shouldHave(text(junitCode));


    }

}
