package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EligeTuUbicacionPage {
    public static Target DROPDOWN_PAISES = Target.the("lista desplegable de paises").locatedBy("//span[@id='GLUXCountryListDropdown']");

    public static Target BTN_LISTO = Target.the("boton listo de elige tu ubicacion").located(By.name("glowDoneButton"));
}
