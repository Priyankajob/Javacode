package REST;

import static io.restassured.RestAssured.given;
import static java.lang.Math.log;
import static org.hamcrest.Matchers.equalTo;

import com.google.gson.JsonObject;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class POJO_request {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
}
