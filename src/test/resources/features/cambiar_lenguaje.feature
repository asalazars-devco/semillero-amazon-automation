# language: es

  Característica: cambiar lenguaje
    Yo como usuario
    Quiero cambiar el lenguaje de la pagina
    Para ver la pagina en lenguaje de preferencia

  Escenario: cambiar lenguaje de la pagina a Ingles
    Dado la pagina se encuentra en lenguaje "ES"
    Cuando cambio el lenguaje de la pagina a "EN"
    Entonces debe verse la pagina en lenguaje "EN"

  Escenario: cambiar lenguaje de la pagina a Aleman
    Dado la pagina se encuentra en lenguaje "ES"
    Cuando cambio el lenguaje de la pagina a "DE"
    Entonces debe verse la pagina en lenguaje "DE"