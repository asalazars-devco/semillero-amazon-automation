package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CabeceraPage {
    public static Target INPUT_BARRA_BUSQUEDA = Target.the("barra de busqueda").locatedBy("//div[@class='nav-search-field ']//input");
    public static Target BTN_CARRITO = Target.the("boton carrito").located(By.id("nav-cart"));

    public static Target BTN_LENGUAJE = Target.the("boton lenguaje").locatedBy("//div[@id='nav-tools']/a[@id='icp-nav-flyout']");

    public static Target SIGLAS_IDIOMA = Target.the("siglas del idioma").locatedBy("//div[@id='nav-tools']/a[@id='icp-nav-flyout']//div");

    public static Target DELIVER_WORD = Target.the("palabra envio en ingles").locatedBy("//div[@id='nav-global-location-slot']//span[contains(text(), 'Deliver to')]");

    public static Target LOGO_AMAZON = Target.the("logo amazon").located(By.id("nav-logo"));
}
