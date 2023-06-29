# language: es

  Característica: Canjear tarjeta de regalo

    @manual
    @manual-result:passed
    Escenario: canjear una tarjeta de regalo de 100 dolares
      Dado que mi saldo de cuenta es de 10 dolares
      Cuando canjeo mi tarjeta de regalo de 100 dolares
      Entonces mi saldo de cuenta debe actualizarse a 110 dolares