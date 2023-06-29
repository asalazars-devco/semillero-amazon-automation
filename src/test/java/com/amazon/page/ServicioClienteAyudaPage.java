package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class ServicioClienteAyudaPage {

    public static Target TITULO_ARTICULO_AYUDA = Target.the("titulo articulo de ayuda acerca de").locatedBy("//div[@class='help-service-content']//h1");

    public static Target BTN_INFORMACION_UTIL_SI = Target.the("boton de calificar como SI util la informacion").locatedBy("//div[@id='hmd-FeedbackBox']//span[contains(@data-action, 'yes')]//input");
}
