Feature: Ingresar al Portal Web demoblaze.com

  @LoginUser @test
  Scenario Outline: Ingresar a la Pagina web y registrar los usuarios
    Given   El usuario este en la pagina de inicio
    When    El usuario selecciona la opcion de registro
    And     Ingresa el nombre de usuario "<username>" y Password "<password>"
    Then    Si la pagina visualizar el mensaje Sign up successful
    Examples:
      | username | password |
      | AB12781  | ab12399  |

