
package REST;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.HashMap;


public class RBDD {
    int id;


    @Test(priority=1 )
    public void getuser() {
        given()
                .baseUri("https://reqres.in/")
                .queryParam("page", 1)
                .queryParam("limit", 1)
                 .when()
                .get("/api/users")
                .then()
                .statusCode(200)
               //.extract().response()
               .body("page", equalTo(1))
                .log().all();

    }
    @Test(priority=2 )
    public void createuser() {
       HashMap<String,String> USER = new HashMap<>();
       USER.put("name","Priyaji");
        USER.put("job","SDET");


       id= given()
                              .queryParam("page",1)
                .body(USER)
               .when()
               .post("https://reqres.in/api/users")
                .jsonPath().getInt("id");


           }

    @Test(priority=3)
    public void updateuser() {
        HashMap<String,String> USER = new HashMap<>();
        USER.put("name","Sonia");
        USER.put("job","Manual");


        given()
                .queryParam("page",1)
                .body(USER)
                .when()
                .post("https://reqres.in/api/users" +id)
                .then()
                .statusCode(201)
                               .log().all();


    }

    @Test(priority=4 )
    public void Delteuser() {



        given()

                .when()
                .delete("https://reqres.in/api/users" +id)
                .then()
                .statusCode(204)
                .log().all();


    }

}