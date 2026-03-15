package projeto.integrador.v;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

@QuarkusTest
class SensorResourceTest {

    @Test
    void testSensorsEndpoint() {
        given()
                .when().get("/sensors")
                .then()
                .statusCode(200)
                .body("sensorData.temperature", notNullValue())
                .body("sensorData.humidity", notNullValue())
                .body("sensorData.luminosity", notNullValue())
                .body("alerts", notNullValue());
    }
}


