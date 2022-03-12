package apitesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import restassured.apis.ApiDemo;

public class ApiTest {

    ApiDemo apiDemo = new ApiDemo();

    @Test
    @Parameters("userID")
    public void getUser(int userId) {
        apiDemo.getUser(userId);
    }
}
