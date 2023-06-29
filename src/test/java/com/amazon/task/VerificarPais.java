package com.amazon.task;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;

public class VerificarPais {
    public static Performable envioA(String pais) {
        Target paisEnvio = obtenerPaisEnvio(pais);

        return Task.where("{0} seleccionando '" + pais + "' como pais de envio",
                Ensure.that(paisEnvio).text().isEqualTo(pais)
        );
    }

    private static Target obtenerPaisEnvio(String pais) {
        Target paisEnvio = Target.the("pais de envio es " + pais).locatedBy("//div[@id='nav-global-location-slot']//span[contains(text(), '" + pais + "')]");
        return paisEnvio;
    }
}
