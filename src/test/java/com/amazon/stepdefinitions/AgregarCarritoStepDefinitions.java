package com.amazon.stepdefinitions;

import com.amazon.task.BuscarItem;
import com.amazon.task.SeleccionarItem;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.Keys;

import static com.amazon.page.CabeceraPage.BTN_CARRITO;
import static com.amazon.page.CabeceraPage.INPUT_BARRA_BUSQUEDA;
import static com.amazon.page.CarritoPage.ITEMS_LIST;

public class AgregarCarritoStepDefinitions {

    @Cuando("agrego un {string} al carrito de compras")
    public void agregoUnItemAlCarritoDeCompras(String item) {
        OnStage.theActorCalled("comprador").attemptsTo(
                Open.url("https://www.amazon.com"),
                Enter.theValue(item).into(INPUT_BARRA_BUSQUEDA).thenHit(Keys.ENTER),
                SeleccionarItem.conEnvioColombia(item)
        );
    }
    @Entonces("debe verse {int} item(s) en el carrito de compras")
    public void verNumeroItemsEnCarritoDeCompras(Integer numeroItems) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(BTN_CARRITO),
                Ensure.that(ITEMS_LIST).textValues().hasSize(numeroItems)
        );
    }

    @Cuando("{actor} agrego al carrito los items")
    public void agregoVariosItemsAlCarritoDeCompras(Actor actor, io.cucumber.datatable.DataTable dataTable) {
        actor.attemptsTo(Open.url("https://www.amazon.com"));
        dataTable.asList().stream().forEach( item -> {
            actor.attemptsTo(BuscarItem.conEnvioColombia(item));
        });
    }
}
