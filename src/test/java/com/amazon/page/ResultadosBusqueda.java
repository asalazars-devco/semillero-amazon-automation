package com.amazon.page;

import net.serenitybdd.screenplay.targets.Target;

public class ResultadosBusqueda {
    public static Target ITEM_COMPRA_ENVIO_COLOMBIA = Target.the("item buscado con envio a Colombia").locatedByFirstMatching("//span[contains(text(),'a Colombia')]/ancestor::div[@data-csa-c-type='item']//img");

    public static Target ITEM_MAS_VENDIDO = Target.the("item mas vendido").locatedByFirstMatching("//span[contains(@id, 'best-seller')]/ancestor::div[@class='a-section a-spacing-base']//img");

    public static Target itemsResultadoBusqueda(String itemEsperado) {
      return Target.the("items que incluyen" + itemEsperado + "en su nombre").locatedBy("//span[contains(text(), '" + itemEsperado + "')]");
    }
}
