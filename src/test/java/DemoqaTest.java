import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DemoqaTest {

    @BeforeAll
    public static void setupConfig() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    public void fillFormTest() {
        open("/automation-practice-form");
        Selenide.sleep(5000);
        executeJavaScript("$(\"[id*='Ad.Plus-']\").remove();");
        Selenide.sleep(5000);

        /*

        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        //Простые инпуты и радио-баттон
        $("#firstName").setValue("Petr");
        $("#lastName").setValue("Petrov");
        $("#userEmail").setValue("petr@test.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("8800555353");

        //Датапикер
        $("#dateOfBirthInput").scrollTo().click();
        $(".react-datepicker__year-select").selectOption("2020");
        $(".react-datepicker__month-select").selectOption("January");
        $$("div.react-datepicker__day").findBy(text("26")).click();

        //Автокомплит
        $("#subjectsInput").scrollTo().setValue("English");
        $("#react-select-2-option-0").click();

        //Чек-бокс
        $("#hobbiesWrapper").scrollTo().$(byText("Music")).click();

        //Загрузка картинки
        $("#uploadPicture").uploadFromClasspath("img.png");

        //textarea
        $("#currentAddress").setValue("Some street 1");

        //Селекты
        $("#state").scrollTo().click();
        $("#stateCity-wrapper").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Agra")).click();

        //Отправка
        $("#submit").click();

        //Проверка
        $(".modal-content").shouldBe(visible);

        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Petr P"));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("petr@test.com"));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Male"));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("8800555353"));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("26 January,2020"));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text("English"));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text("Music"));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text("img.png"));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text("Some street 1"));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("Uttar Pradesh Agra"));
*/
    }

}
