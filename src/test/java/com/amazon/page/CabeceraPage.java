package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CabeceraPage {
    public static Target INPUT_BARRA_BUSQUEDA = Target.the("barra de busqueda").locatedBy("//div[@class='nav-search-field ']//input");
    public static Target BTN_CARRITO = Target.the("boton carrito").located(By.id("nav-cart"));

    public static Target BTN_LENGUAJE = Target.the("boton lenguaje").locatedBy("//div[@id='nav-tools']/a[@id='icp-nav-flyout']");

    public static Target SIGLAS_IDIOMA = Target.the("siglas del idioma").locatedBy("//div[@id='nav-tools']/a[@id='icp-nav-flyout']//div");

    public static Target LOGO_AMAZON = Target.the("logo amazon").located(By.id("nav-logo"));

    public static Target DROPDOWN_CATEGORIAS = Target.the("lista desplegable de categorias").locatedBy("//div[@id='nav-search-dropdown-card']");

    public static Target MENU_DESPLEGABLE_HAMBURGESA = Target.the("menu tipo hamburgesa que despliega opciones").located(By.id("nav-hamburger-menu"));

    public static Target BTN_ENVIAR_A = Target.the("boton enviar a").located(By.id("nav-global-location-slot"));
}
