package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class MenuDesplegablePage {

    public static Target VER_TODO_CATEGORIAS = Target.the("opcion ver todas las categorias").locatedByFirstMatching("//div[text()='ver todo']/ancestor::a");

}
