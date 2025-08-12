package jornadas.generico.steps;

import jornadas.generico.actions.GenericoAction;
import jornadas.tiposcarros.actions.TiposCarrosAction;

import java.net.http.HttpResponse;

public class GenericoSteps {

    TiposCarrosAction pedidosAction;
    GenericoAction genericoActions;

    public HttpResponse get_response() {
        return _response;
    }

    public void set_response(HttpResponse _response) {
        this._response = _response;
    }

    HttpResponse _response;

    public GenericoSteps() throws Exception {

    }




}
