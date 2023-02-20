package ru.netology.rest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
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
                .body("data", equalTo("data"))
        ;
    }
}




