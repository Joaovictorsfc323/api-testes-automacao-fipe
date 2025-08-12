package jornadas.tiposcarros.actions;

import io.restassured.http.Method;
import jornadas.generico.actions.GenericoAction;
import jornadas.generico.actions.TokenAction;
import org.junit.Assert;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class TiposCarrosAction {


    public String tiposcarros() {

        String urlCarros = "https://brasilapi.com.br/api/fipe/marcas/v1/carros";
        String response = "";
        given()
                .when()
                .get(urlCarros)
                .then()
                .statusCode(200); // Verifica se o código de status é 200

        
        return response;



    }


}
