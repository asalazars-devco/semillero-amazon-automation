package com.amazon.stepdefinitions;

import com.amazon.task.CambiarCategoriaDropdown;
import com.amazon.task.SeleccionarItem;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

import static com.amazon.page.CabeceraPage.*;

public class MasVendidoPorCategoriaStepDefinitions {

    @Dado("realizo una busqueda por {string}")
    public void realizarBusquedaPorCategoria(String categoria) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                Click.on(DROPDOWN_CATEGORIAS),
                CambiarCategoriaDropdown.Seleccionar(categoria),
                Enter.theValue().into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER)
        );
    }

    @Cuando("selecciono un item de los mas vendidos")
    public void seleccionarUnItemDeLosMasVendidos() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarItem.masVendidos()
        );
    }

    @Entonces("debe verse la pagina de detalle del item")
    public void verPaginaDetalleItem() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(BTN_CARRITO).isDisplayed()
        );
    }
}
