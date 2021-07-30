package com.virgingames.www.cucumber.virgingamesinfo;

import com.virgingames.www.constants.EndPoints;
import com.virgingames.www.cucumber.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class FirstSerenityTest extends TestBase {

    @Test
    public void getAllGames(){
        SerenityRest.rest().given()
                .when()
                .get(EndPoints.GET_ALL_GAMES)
                .then()
                .log().all()
                .statusCode(200);
    }
}
