# language: es

  Característica: Realizar pago

    @manual
    @manual-result:passed
    Escenario: realizar pago de una orden
      Dado que ya agregue 2 items al carrito de compras
      Cuando realizo el pago de la orden
      Entonces confirmo que mi compra fue realizada y tiene 2 items