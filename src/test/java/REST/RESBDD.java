package REST;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.HashMap;
import io.restassured.response.Response;

@Test
public class RESBDD {

    int id;
   private Response response;

    public void createuser()
    {
        HashMap<String,String> User = new HashMap<>();
        User.put("name","morpheus");
        id =given()
            .baseUri("https://reqres.in/")
            .body(User)
            .when()
            .post("api/users")
            .jsonPath().getInt("id");


    }
    public void updateuser()
    {

        HashMap<String,String> User = new HashMap<>();
        User.put("name","morpheus");
        response = given()
                .baseUri("https://reqres.in/")
                .body(User)
                .when()
                .post("api/users" +id)
                .then()
                .statusCode(201)
               .extract().response();
        System.out.println("Print Response" +response.getBody().asString());


    }

    public void getuser()
    {

//        HashMap<String,String> User = new HashMap<>();
//        User.put("name","morpheus");
        given()
                .baseUri("https://reqres.in/")
                .queryParam("id","1")
                .log().uri()
                .when()
                .get("api/users")
                .then()
                .statusCode(200)
                .log().all();


    }
}
