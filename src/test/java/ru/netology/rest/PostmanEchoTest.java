package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matcher.equalTo;

public class PostmanEchoTest {
    @Test
    void shouldReturnSendData() {
        given()
                .baseUri("http://postman-echo.com")
                .body("data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equlTo("data"))
        ;
    }
}




