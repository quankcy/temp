package restassured;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class Some {

    @Test
    public void someRestAssured() {
        Header header1 = new Header("key", "value");
        Header header2 = new Header("key", "value");
        Headers headers = new Headers(header1, header2);

        System.out.println("\nREQUEST:");
        Response response = RestAssured
                .given()
                .log()
                .all()
//                .ifValidationFails()
                .headers(headers)
//                .body()
                .when()
//                .request("POST", "")
//                .post("")
                .get("https://pokeapi.co/api/v2/pokemon/ditto");
//                .put(")
//                .patch("")
//                .delete("")

        System.out.println("\nRESPONSE:");
        response.then()
                .log()
                .all()
//                .ifValidationFails()
                .time(Matchers.lessThan(5000L))
                .statusCode(200)
                .body("abilities[0].ability.name", Matchers.equalTo("limber"))
                .body("abilities[0].slot", Matchers.equalTo(1))
        ;

//        response.andReturn().body().asString();

    }

}
