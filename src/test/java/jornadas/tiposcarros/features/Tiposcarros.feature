# language: pt
@TiposCarros
Funcionalidade: Validar tipos de carros

  @carros
  Esquema do Cenário: Verificar tipos de carros
    Dado que eu tenho api tipos de carros
    Entao devo obter o codigo de status tipos de carros 200

    Exemplos:
      | company                              | toCustomer                           | ebox                                | type    |
      | 35fee5a5-4b5a-42ef-a583-55fd4e4f364d | 3c22ffd1-7236-44b1-aa6c-430b221864a0 |ba1e5703-334c-4a8e-9fe1-c26549d9af81 |return   |



