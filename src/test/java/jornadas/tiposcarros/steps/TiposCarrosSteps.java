package jornadas.tiposcarros.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.restassured.http.Method;
import jornadas.generico.actions.GenericoAction;
import jornadas.generico.steps.GenericoSteps;
import jornadas.tiposcarros.actions.TiposCarrosAction;

import java.net.http.HttpResponse;

public class TiposCarrosSteps {
    TiposCarrosAction TiposCarrosAction;
    private String response;


    public TiposCarrosSteps() throws Exception {
        TiposCarrosAction = new TiposCarrosAction();



    }

    @Dado("que eu tenho api tipos de carros")
    public void queEuTenhoApiTiposDeCarros() {

        response = TiposCarrosAction.tiposcarros();
        System.out.println(response);
    }


    @Entao("devo obter o codigo de status tipos de carros {int}")
    public void devoObterOCodigoDeStatusTiposDeCarros(int arg0) {
    }
}







