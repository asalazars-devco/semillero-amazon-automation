package com.amazon.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.amazon.page.DetalleItem.BTN_AGREGAR_CARRITO;
import static com.amazon.page.ResultadosBusqueda.ITEM_COMPRA_ENVIO_COLOMBIA;

public class SeleccionarItem {
    public static Performable conEnvioColombia(String item) {
        return Task.where("{0} buscando por '" + item + "'",
                Click.on(ITEM_COMPRA_ENVIO_COLOMBIA.of(item)),
                Click.on(BTN_AGREGAR_CARRITO)
        );
    }
}
