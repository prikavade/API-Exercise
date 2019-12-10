package services;

import constants.ConfigurationConstant;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Comments {

    public static Response fetchComment(int id) {

        return given()
                .baseUri(ConfigurationConstant.APP_URL)
                .queryParam("id", id)
                .when()
                .get(ConfigurationConstant.COMMENTS_END_POINT);
    }


}
