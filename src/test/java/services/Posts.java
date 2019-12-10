package services;

import constants.ConfigurationConstant;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Posts {

    public static Response getPosts() {

        return given()
                .baseUri(ConfigurationConstant.APP_URL)
                .when()
                .get(ConfigurationConstant.POSTS_END_POINT);
    }

    public static Response getUserId(int id) {

        return given()
                .baseUri(ConfigurationConstant.APP_URL)
                .queryParam("id", id)
                .when()
                .get(ConfigurationConstant.POSTS_END_POINT);
    }


    public static Response searchPosts(int userId) {

        return given()
                .baseUri(ConfigurationConstant.APP_URL)
                .queryParam("userId", userId)
                .when()
                .get(ConfigurationConstant.POSTS_END_POINT);
    }

    public static Response getPostsId(int id) {

        return given()
                .baseUri(ConfigurationConstant.APP_URL)
                .when()
                .get(ConfigurationConstant.POSTS_END_POINT+"/"+id);
    }


    public static Response addPosts() {

        return given()
                .baseUri(ConfigurationConstant.APP_URL)
                .body("{\n" +
                        "        \"userId\": 12,\n" +
                        "        \"title\": \"ea molestias quasi exercitationem repellat qui ipsa sit aut\",\n" +
                        "        \"body\": \"et iusto sed quo iure\\nvoluptatem occaecati omnis eligendi aut ad\\nvoluptatem doloribus vel accusantium quis pariatur\\nmolestiae porro eius odio et labore et velit aut\"\n" +
                        "    }")
                .when()
                .post(ConfigurationConstant.POSTS_END_POINT);
    }

    public static Response updatePosts(int id) {

        return given()
                .baseUri(ConfigurationConstant.APP_URL)
                .body("{\n" +
                        "    \"userId\": 122,\n" +
                        "    \"id\": "+id+",\n" +
                        "    \"title\": \"upadtedt\",\n" +
                        "    \"body\": \"upadtedtsso\"\n" +
                        "}")
                .when()
                .put(ConfigurationConstant.POSTS_END_POINT+"/"+id);
    }


    public static Response deletePosts(int id) {

        return given()
                .baseUri(ConfigurationConstant.APP_URL)
                .when()
                .delete(ConfigurationConstant.POSTS_END_POINT+"/"+id);
    }

}
