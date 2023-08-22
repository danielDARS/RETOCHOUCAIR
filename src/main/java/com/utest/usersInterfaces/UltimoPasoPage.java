package com.utest.usersInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UltimoPasoPage extends PageObject {

    public static final Target TXT_PASSWORD = Target.the("selecciona el campo contraseña")
            .located(By.xpath("//input[@id='password']"));
    public static final Target TXT_CONFIRM_PASSWORD = Target.the("selecciona el campo confirmar contraseña")
            .located(By.xpath("//input[@id='confirmPassword']"));
    public static final Target BTN_TERMINOS = Target.the("selecciona el campo de terminos")
            .located(By.xpath("(//span[@class='checkmark signup-consent__checkbox error'])[1]"));
    public static final Target BTN_POLITICAS = Target.the("selecciona el campo de politicas")
            .located(By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));
    public static final Target BTN_COMPLETE = Target.the("selecciona el boton completar")
            .located(By.xpath("//span[contains(text(),'Complete Setup')]"));


}
