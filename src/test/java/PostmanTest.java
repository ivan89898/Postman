import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {
@Test
        void post() {
    given()
            .baseUri("https://postman-echo.com")
            .body("some data hello") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
            .when()
            .post("/post")
// Проверки
            .then()
            .statusCode(200)
            .body("data",equalTo("some data "))
    ;
}
}
