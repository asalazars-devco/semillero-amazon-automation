package com.amazon.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static com.amazon.page.CabeceraPage.BTN_LENGUAJE;
import static com.amazon.page.PreferenciasUsuarioPage.*;

public class SeleccionarLenguaje {
    public static Performable cambiarA(String lenguaje) {
        Target opcionIdioma = obtenerOpcionIdioma(lenguaje);

        return Task.where("{0} seleccionando '" + lenguaje + "'",
                Click.on(BTN_LENGUAJE),
                Click.on(opcionIdioma),
                Click.on(BTN_GUARDAR_CAMBIOS)
        );
    }

    private static Target obtenerOpcionIdioma(String lenguaje) {
        Target opcionIdioma = Target.the("opcion lenguaje " + lenguaje).locatedBy("//div[@id='icp-language-settings']//span[text()='" + lenguaje + "']/ancestor::div[@class='a-row a-spacing-mini']");
        return opcionIdioma;
    }
}
