package com.amazon.stepdefinitions;

import com.amazon.task.ObtenerInformacion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

import static com.amazon.page.FooterPage.SECCION_AYUDA;
import static com.amazon.page.SeccionAyudaPage.INPUT_BUSQUEDA_AYUDA;
import static com.amazon.page.ServicioClienteAyudaPage.BTN_INFORMACION_UTIL_SI;
import static com.amazon.page.ServicioClienteAyudaPage.TITULO_ARTICULO_AYUDA;

public class BuscarSeccionAyudaStepDefinitions {

    @Dado("{actor} ingresa a la seccion de ayuda")
    public void ingresarSeccionAyuda(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.amazon.com"),
                Click.on(SECCION_AYUDA)
        );
    }

    @Cuando("busca informacion sobre {string}")
    public void buscarInformacionSobre(String temaDeInteres) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Enter.theValue(temaDeInteres).into(INPUT_BUSQUEDA_AYUDA).thenHit(Keys.ENTER)
        );
    }

    @Entonces("obtiene informacion acerca de {string}")
    public void obtenerInformacion(String temaDeInteres) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ObtenerInformacion.acercaDe(temaDeInteres),
                Ensure.that(TITULO_ARTICULO_AYUDA).text().containsIgnoringCase(temaDeInteres),
                Ensure.that(BTN_INFORMACION_UTIL_SI).isDisplayed(),
                Click.on(BTN_INFORMACION_UTIL_SI)
        );
    }
}
