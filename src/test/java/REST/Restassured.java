package REST;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

public class Restassured {

    private Response response;

    int id;

    @Test(priority=3 )
    public void getUser() {  // Changed to non-static method
        response =given()
                .queryParam("page", '2')
                .queryParam("limit", '1')
                .when()
               .get("https://reqres.in/api/users")
                .then()
                .statusCode(200)
                .extract()
                .response();
                //.body("page", equalTo(2))
        System.out.println("Response is" +response.getBody().asString());


    }

    @Test (priority=1)
    public void createUser() {

        HashMap<String,String> usr = new HashMap<>();
        usr.put("name", "morpheus");
        usr.put("job", "leader");
        // Changed to non-static method
        id =given()
                .contentType("application/json")
                .body(usr)
                .when()
                .post("https://reqres.in/api/users")
                .jsonPath().getInt("id");




    }
    @Test(priority=2)
    public void updateUser() {

        HashMap<String,String> usr = new HashMap<>();
        usr.put("name", "Priya");
        usr.put("job", "Influencer");
        // Changed to non-static method
        given()
                .contentType("application/json")
                .body(usr)
                .when()
                .put("https://reqres.in/api/users/"+id)
                .then()
                .statusCode(200)
                .log().all();



    }

    @Test(priority=4)
    public void deleteuser()
    {
        given()
                .when()
                .delete("https://reqres.in/api/users/"+id)
                .then()
                .statusCode(204)
                .log().all();
    }
}