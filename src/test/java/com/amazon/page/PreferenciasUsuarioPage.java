package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class PreferenciasUsuarioPage {
    public static Target OPCION_LENGUAJES = Target.the("lista de opciones de lenguajes").locatedBy("//div[@id='icp-language-settings']");

    public static Target OPCION_ES = Target.the("opcion lenguaje Español").locatedBy("//div[@id='icp-language-settings']//span[text()='ES']/ancestor::div[@class='a-row a-spacing-mini']");

    public static Target OPCION_EN = Target.the("opcion lenguaje English").locatedBy("//div[@id='icp-language-settings']//span[text()='EN']/ancestor::div[@class='a-row a-spacing-mini']");

    public static Target OPCION_DE = Target.the("opcion lenguaje Deutsch").locatedBy("//div[@id='icp-language-settings']//span[text()='DE']/ancestor::div[@class='a-row a-spacing-mini']");

    public static Target OPCION_PT = Target.the("opcion lenguaje Português").locatedBy("//div[@id='icp-language-settings']//span[text()='PT']/ancestor::div[@class='a-row a-spacing-mini']");

    public static Target BTN_GUARDAR_CAMBIOS = Target.the("boton guardar cambios").locatedBy("//span[@id='icp-save-button']//input");
}
