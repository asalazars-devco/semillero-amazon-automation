package com.amazon.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarPaisDropdown {
    public static Performable seleccionar(String pais) {
        Target opcionPais = obtenerOpcionPais(pais);

        return Task.where("{0} seleccionando '" + pais + "'",
                Click.on(opcionPais)
        );
    }

    private static Target obtenerOpcionPais(String pais) {
        Target opcionPais = Target.the("opcion pais " + pais).locatedBy("//a[text()= '" + pais + "']");
        return opcionPais;
    }
}
