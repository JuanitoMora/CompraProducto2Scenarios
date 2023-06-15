Feature: Realizar compras de articulos
  Como un nuevo cliente
  Quiero ingresar a la pagina www.abc.com
  Para realizar una compra de un articulo

  @SinEjemplos
  Scenario: Agregar articulos al carrito de compras
    Given un nuevo cliente accede hasta la web de compras
    When el agrega las unidades de "Tapabocas KN95" al carro
    Then el ve los productos listados en el carro de compras

  @ConEjemplos
  Scenario Outline: Agregar mas articulos al carrito de compras
    Given un nuevo cliente accede hasta la web de compras
    When el agrega un producto al carro
      | <nombreProducto> | <cantidadAgregar> |
    Then el ve los productos listados en el carro de compras

    Examples:
      | nombreProducto | cantidadAgregar |
      | Tapabocas N95  | 100             |
