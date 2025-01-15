package REST;

import static io.restassured.RestAssured.given;
import static java.lang.Math.log;
import static org.hamcrest.Matchers.equalTo;

import com.google.gson.JsonObject;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

@Test
public class Jsonobeject {

    public void jsondatacreation()
    {
        JSONObject datajson = new JSONObject();
        datajson.put("name","");
        String[] course = {"C","C++"};
        datajson.put("Courses", "course");
        given()
                .contentType("application/json")
                .body(datajson.toString())
                .when()
                .post("https://reqres.in/api/users")
               .then()
            .log().all();
    }

    public void testpoja()
    {
        POJO_request PJ =new POJO_request();
        PJ.setName("Rooma");
        given()
                .contentType("application/json")
                .body(PJ)
                .when()
                .post("https://reqres.in/api/users")
                .then()
                .log().all();
    }


}
