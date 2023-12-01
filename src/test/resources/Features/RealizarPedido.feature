Feature: Ingresar al Portal Web demoblaze.com

  @LoginUser @test
  Scenario Outline: Ingresar a la pagina y registrar un Pedido
    Given El usuario se encuentre en la Opcion Carro de compras
    When  El usuario Ingrese a la Opcion Pedidos
    And   Ingresar el "<name>" y "<country>" y "<city>" y "<card>" y "<month>" y "<year>"
    Then  Visualice la Modal Thank you for your purchase

    Examples:
      | name | country | city | card | month | year |
      | John | EE. UU. | NY   | 1234 | Marzo | 2024 |

