Feature: Ingresar al Portal Web demoblaze.com

  Scenario Outline: Ingresar a la Pagina web y loguear los usuarios
    Given El usuario se encuetra en la pagina de inicio
    When  El usuario selecciona la opcion de login
    And   Digita el nombre de usuario "<username>" y Password "<password>"
    Then  Si la pagina visualizar la opcion Log Out
    Examples:
      | username       | password |
      | pruebapragma18 | 123456   |


