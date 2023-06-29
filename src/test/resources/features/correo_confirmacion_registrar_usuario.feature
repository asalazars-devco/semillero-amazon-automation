# language: es

  Característica: Recibir correo de confirmacion al registrar un nuevo usuario

    @manual
    @manual-result:passed
    Escenario: recibir correo de confirmacion al registrarme como nuevo usuario
      Cuando me registro como nuevo usuario
      Entonces recibo un correo de confirmacion del registro de mi usuario