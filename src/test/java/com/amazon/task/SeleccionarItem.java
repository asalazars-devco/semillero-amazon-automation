package com.amazon.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.amazon.page.DetalleItem.BTN_AGREGAR_CARRITO;
import static com.amazon.page.ResultadosBusqueda.ITEM_COMPRA_ENVIO_COLOMBIA;
import static com.amazon.page.ResultadosBusqueda.ITEM_MAS_VENDIDO;

public class SeleccionarItem {
    public static Performable conEnvioColombia(String item) {
        return Task.where("{0} buscando por '" + item + "'",
                Click.on(ITEM_COMPRA_ENVIO_COLOMBIA.of(item)),
                Click.on(BTN_AGREGAR_CARRITO)
        );
    }

    public static Performable masVendidos() {
        return Task.where("{0} buscando item mas vendido",
                Click.on(ITEM_MAS_VENDIDO)
        );
    }
}
