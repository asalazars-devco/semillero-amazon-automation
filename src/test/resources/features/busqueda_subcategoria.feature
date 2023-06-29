# language: es

  Característica: obtener los items correctos de una categoria
    Yo como comprador
    Quiero realizar una busqueda por categoria
    Para ver los items correspondientes a esta categoria

  Escenario: obtener al menos un numero de items relacionados con Impresoras
    Cuando selecciono la categoria "Computadoras"
    Y selecciono la subcategoria "Impresoras"
    Entonces al menos 10 resultados de busqueda deben ser relacionados a "Impresora"

  Escenario: obtener al menos un numero de items relacionados con Rompecabezas
    Cuando selecciono la categoria "Juguetes y juegos"
    Y selecciono la subcategoria "Rompecabezas"
    Entonces al menos 5 resultados de busqueda deben ser relacionados a "Rompecabezas"