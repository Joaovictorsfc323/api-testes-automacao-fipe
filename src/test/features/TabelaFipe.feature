# language: pt
@pedidocorreios
Funcionalidade: Validar pedidos

    @tiposdecaross
    Esquema do Cenário: Verificar tipos de carros
        Dado que tenho api tipos de carros
        Entao devo obter o codigo de status 200

        Exemplos:
            |codigoobjeto |largura|comprimento|altura|peso|formato |pcd|
            |teste109     |5      |5          |5     |1   |pacote  |N  |
