package com.amazon.stepdefinitions;

import com.amazon.task.SeleccionarLenguaje;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.amazon.page.CabeceraPage.LOGO_AMAZON;
import static com.amazon.page.CabeceraPage.SIGLAS_IDIOMA;

public class CambiarLenguajeStepDefinitions {

    @Dado("la pagina se encuentra en lenguaje {string}")
    public void obtenerLenguajePagina(String lenguaje) {
        OnStage.theActorCalled("usuario").attemptsTo(
                Open.url("https://www.amazon.com"),
                Ensure.that(SIGLAS_IDIOMA).textContent().isEqualTo(lenguaje)
        );
    }

    @Cuando("cambio el lenguaje de la pagina a {string}")
    public void cambiarLenguajePagina(String lenguaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarLenguaje.CambiarA(lenguaje)
        );
    }

    @Entonces("debe verse la pagina en lenguaje {string}")
    public void verificarLenguajePagina(String lenguaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(LOGO_AMAZON),
                Ensure.that(SIGLAS_IDIOMA).textContent().isEqualTo(lenguaje)
        );
    }
}
