# language: es

  Característica: configurar la ubicacion geografica
    Yo como usuario
    Quiero configurar la ubicacion geografica
    Para que concuerde con mi ubicacion actual

  Escenario: configurar la ubicacion geografica a Argentina
    Cuando cambio la ubicacion geografica a "Argentina"
    Entonces en el Enviar a debe verse "Argentina"
