import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class TestClass {
    @Test
    public void FirstTest(){
        RestAssured.
        when().get("https://restful-booker.herokuapp.com/ping").
                then().assertThat().statusCode(201);
    }

}