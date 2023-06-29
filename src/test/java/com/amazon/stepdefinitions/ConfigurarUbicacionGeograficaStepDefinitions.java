package com.amazon.stepdefinitions;

import com.amazon.task.SeleccionarPaisDropdown;
import com.amazon.task.VerificarPais;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static com.amazon.page.CabeceraPage.BTN_ENVIAR_A;
import static com.amazon.page.EligeTuUbicacionPage.BTN_LISTO;
import static com.amazon.page.EligeTuUbicacionPage.DROPDOWN_PAISES;

public class ConfigurarUbicacionGeograficaStepDefinitions {

    @Cuando("cambio la ubicacion geografica a {string}")
    public void cambiarUbicacionGeografica(String pais) {
        OnStage.theActorCalled("usuario").attemptsTo(
                Open.url("https://www.amazon.com"),
                Click.on(BTN_ENVIAR_A),
                DoubleClick.on(DROPDOWN_PAISES),
                SeleccionarPaisDropdown.seleccionar(pais),
                Click.on(BTN_LISTO)
        );
    }

    @Entonces("en el Enviar a debe verse {string}")
    public void verificarUbicacionGeografica(String pais) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                VerificarPais.envioA(pais)
        );
    }
}
