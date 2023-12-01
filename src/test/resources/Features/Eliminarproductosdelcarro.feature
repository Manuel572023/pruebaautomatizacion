Feature: Ingresar al Portal Web demoblaze.com

  Scenario: Ingresar a la pagina y ingresar un producto al carro y eliminarlo
    Given   El usuario se encuentre en la pagina de carro de compras
    When    Elimina el producto agregado que se visualiza en el contenedor
    Then    Se elimine el producto


