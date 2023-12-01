Feature: Ingresar al Portal Web demoblaze.com

  Scenario: Ingresar a la pagina y ingresar un producto  al carro de compras
    Given   El usuario se encuentre en la pagina principal
    When    Seleccione el producto y lo agrege al carro
    Then    La pagina emita el mensaje de Product added


