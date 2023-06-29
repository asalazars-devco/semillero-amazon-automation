package com.amazon.stepdefinitions;

import com.amazon.task.SeleccionarCategoriaMenu;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;

import static com.amazon.page.CabeceraPage.*;
import static com.amazon.page.MenuDesplegablePage.*;
import static com.amazon.page.ResultadosBusqueda.itemsResultadoBusqueda;

public class BuscarPorSubcategoria {

    @Cuando("selecciono la categoria {string}")
    public void seleccionarLaCategoria(String categoria) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                Click.on(MENU_DESPLEGABLE_HAMBURGESA),
                Click.on(VER_TODO_CATEGORIAS),
                SeleccionarCategoriaMenu.Seleccionar(categoria)
        );
    }

    @Cuando("selecciono la subcategoria {string}")
    public void seleccionarLaSubcategoriaImpresoras(String subcategoria) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                SeleccionarCategoriaMenu.Seleccionar(subcategoria)
        );
    }

    @Entonces("al menos {int} resultados de busqueda deben ser relacionados a {string}")
    public void verificarResultadosBusqueda(Integer resultadosEsperados, String itemEsperado) {
        Target ITEMS_RESULTADO_BUSQUEDA = itemsResultadoBusqueda(itemEsperado);

        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(ITEMS_RESULTADO_BUSQUEDA).text().contains(itemEsperado),
                Ensure.that(ITEMS_RESULTADO_BUSQUEDA).textValues().hasSizeGreaterThanOrEqualTo(resultadosEsperados)
        );
    }
}
