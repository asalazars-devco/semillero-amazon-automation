package com.amazon.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class ObtenerInformacion {
    public static Performable acercaDe(String temaDeInteres) {
        Target infoAcercaDe = obtenerInfoAcercaDe(temaDeInteres);

        return Task.where("{0} obteniendo informacion sobre '" + temaDeInteres + "'",
                Click.on(infoAcercaDe)
        );
    }

    private static Target obtenerInfoAcercaDe(String temaDeInteres) {
        Target infoAcercaDe = Target.the("informacion acerca de " + temaDeInteres).locatedBy("//a[contains(text(), 'Acerca de " + temaDeInteres + "')]");
        return infoAcercaDe;
    }
}
