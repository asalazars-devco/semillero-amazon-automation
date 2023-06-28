# language: es

  Característica: cambiar lenguaje
    Yo como usuario
    Quiero cambiar el lenguaje de la pagina
    Para ver la pagina en lenguaje de preferencia

  Escenario: cambiar lenguaje de la pagina a Ingles
    Dado la pagina se encuentra en lenguaje "Español"
    Cuando cambio el lenguaje de la pagina a "English"
    Entonces debe verse la pagina en lenguaje "English"

  Escenario: cambiar lenguaje de la pagina a Aleman
    Dado la pagina se encuentra en lenguaje "Español"
    Cuando cambio el lenguaje de la pagina a "Deutsch"
    Entonces debe verse la pagina en lenguaje "Deutsch"