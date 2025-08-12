$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/jornadas/tiposcarros/features/TiposCarros.feature");
formatter.feature({
  "name": "Validar tipos de carros",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@TiposCarros"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verificar tipos de carros",
  "description": "",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "name": "@carros"
    }
  ]
});
formatter.step({
  "name": "que eu tenho api tipos de carros",
  "keyword": "Dado "
});
formatter.step({
  "name": "devo obter o codigo de status tipos de carros 200",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "company",
        "toCustomer",
        "ebox",
        "type"
      ]
    },
    {
      "cells": [
        "35fee5a5-4b5a-42ef-a583-55fd4e4f364d",
        "3c22ffd1-7236-44b1-aa6c-430b221864a0",
        "ba1e5703-334c-4a8e-9fe1-c26549d9af81",
        "return"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verificar tipos de carros",
  "description": "",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "name": "@TiposCarros"
    },
    {
      "name": "@carros"
    }
  ]
});
formatter.step({
  "name": "que eu tenho api tipos de carros",
  "keyword": "Dado "
});
formatter.match({
  "location": "TiposCarrosSteps.queEuTenhoApiTiposDeCarros()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo obter o codigo de status tipos de carros 200",
  "keyword": "Entao "
});
formatter.match({
  "location": "TiposCarrosSteps.devoObterOCodigoDeStatusTiposDeCarros(int)"
});
formatter.result({
  "status": "passed"
});
});