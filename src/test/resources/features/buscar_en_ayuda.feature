# language: es

  Característica: buscar en ayuda
    Yo como comprador
    Quiero buscar en la seccion de ayuda
    Para obtener informacion acerda de un tema

  Escenario: buscar en la seccion de ayuda sobre Amazon Business
    Dado "Jorge" ingresa a la seccion de ayuda
    Cuando busca informacion sobre "Amazon Business"
    Entonces obtiene informacion acerca de "Amazon Business"

  Escenario: buscar en la seccion de ayuda sobre Prime Day
    Dado "Jorge" ingresa a la seccion de ayuda
    Cuando busca informacion sobre "Prime Day"
    Entonces obtiene informacion acerca de "Prime Day"