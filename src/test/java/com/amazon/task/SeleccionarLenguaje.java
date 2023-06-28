package com.amazon.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.HashMap;
import java.util.Map;

import static com.amazon.page.CabeceraPage.BTN_LENGUAJE;
import static com.amazon.page.PreferenciasUsuarioPage.*;

public class SeleccionarLenguaje {
    public static Performable CambiarA(String lenguaje) {
        Target opcionIdioma = obtenerOpcionIdioma(lenguaje);

        return Task.where("{0} seleccionando '" + lenguaje + "'",
                Click.on(BTN_LENGUAJE),
                Click.on(opcionIdioma),
                Click.on(BTN_GUARDAR_CAMBIOS)
        );
    }

    private static final Map<String, Target> opcionesIdioma = new HashMap<>();

    static {
        opcionesIdioma.put("English", OPCION_EN);
        opcionesIdioma.put("Español", OPCION_ES);
        opcionesIdioma.put("Português", OPCION_PT);
        opcionesIdioma.put("Deutsch", OPCION_DE);
    }

    private static Target obtenerOpcionIdioma(String lenguaje) {
        Target opcionIdioma = opcionesIdioma.get(lenguaje);
        if (opcionIdioma == null) {
            throw new IllegalArgumentException("Lenguaje no valido: " + lenguaje);
        }
        return opcionIdioma;
    }
}
