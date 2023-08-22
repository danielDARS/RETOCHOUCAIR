package com.utest.usersInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ValidacionPage {
    public static final Target TXT_VALIDACION = Target.the("selecciona el boton completar")
            .located(By.xpath("//div[@class='image-box-header']"));

}
