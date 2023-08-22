package com.utest.usersInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DireccionPage extends PageObject {

    public static final Target TXT_CITY = Target.the("digita el campo ciudad")
            .located(By.xpath("//input[@id='city']"));
    public static final Target TXT_ZIP = Target.the("digita el campo zip")
            .located(By.xpath("//input[@id='zip']"));

    public static final Target BTN_NEX2 = Target.the("click en el boton siguiente de la segunda pagina")
            .located(By.xpath("//span[contains(text(),'Next: Devices')]"));

}
