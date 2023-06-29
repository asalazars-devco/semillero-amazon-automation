package com.amazon.stepdefinitions;

import io.cucumber.java.Before;
import org.junit.AssumptionViolatedException;

public class SaltarPruebasManualesStepDefinitions {

    @Before("@manual")
    public void omitirEscenarioManual() {
        throw new AssumptionViolatedException("Este escenario es manual y no se ejecutara automaticamente.");
    }
}
