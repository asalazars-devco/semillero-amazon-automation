# language: es

  Característica: agregar al carrito
    Yo como comprador
    Quiero agregar elementos a un carrito de compras
    Para posteriormente comprar

  Escenario: agregar un control de pc al carrito de compras
    Cuando agrego un "control gaming" al carrito de compras
    Entonces debe verse 1 item en el carrito de compras

  Escenario: agregar 3 items al carrito de compras
    Cuando Carlos agrego al carrito los items
      |"control gaming"|
      |"mouse gaming"  |
      |"teclado pc"    |
    Entonces debe verse 3 items en el carrito de compras