package services;

import constants.ConfigurationConstant;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Users {

    public static Response getUsers(String user) {

        return given()
                .baseUri(ConfigurationConstant.APP_URL)
                .queryParam("username", user)
                .when()
                .get(ConfigurationConstant.USERS_END_POINT);
    }


    public static Response getUsersInvalidEndpoint() {

        return given()
                .baseUri(ConfigurationConstant.APP_URL)
                .when()
                .get(ConfigurationConstant.INVALID_USERS_END_POINT);
    }

    public static Response getUsersWithId(int id) {

        return given()
                .baseUri(ConfigurationConstant.APP_URL)
                .when()
                .get(ConfigurationConstant.USERS_END_POINT+"/"+id);
    }

}
