# language: es

  Característica: seleccionar un item de los mas vendidos por categoria
    Yo como comprador
    Quiero seleccionar productos de los mas vendidos por categoria
    Para ver la pagina de detalle del item

  Escenario: seleccionar un item de los mas vendidos por categoria Videojuegos
    Dado realizo una busqueda por "Videojuegos"
    Cuando selecciono un item de los mas vendidos
    Entonces debe verse la pagina de detalle del item