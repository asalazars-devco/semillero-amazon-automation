package com.amazon.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class CambiarCategoriaDropdown {
    public static Performable seleccionar(String categoria) {
        Target opcionCategoria = obtenerOpcionCategoria(categoria);

        return Task.where("{0} seleccionando '" + categoria + "'",
                Click.on(opcionCategoria)
        );
    }

    private static Target obtenerOpcionCategoria(String categoria) {
        Target opcionCategoria = Target.the("opcion categoria " + categoria).locatedBy("//option[contains(text(), '" + categoria +"')]");
        return opcionCategoria;
    }
}
