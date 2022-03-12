package restassured.apis;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiDemo {

    public void getUser(int userID) {
        Response response = RestAssured.given().baseUri("https://reqres.in/api/users?page=" + userID).get();
        System.out.println("API call completed with status code : " + response.getStatusCode());
        System.out.println("User retrieved : " + response.getBody());
    }

}
