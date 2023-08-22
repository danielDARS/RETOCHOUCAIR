package com.utest.usersInterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://utest.com/")

public class RegistroPage  extends PageObject {

    public static final Target BTN_JOIN_TODAY= Target.the("entra al registro")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

    public static final Target TXT_FIRS_NAME = Target.the("digita el campo de nombre")
            .located(By.xpath("//input[@id='firstName']"));

    public static final Target TXT_LAST_NAME = Target.the("digita el campo de apellido")
            .located(By.xpath("//input[@id='lastName']"));

    public static final Target TXT_EMAIL = Target.the("digita el campo de email")
            .located(By.xpath("//input[@id='email']"));

    public static final Target LIST_MONTH = Target.the("selecciona la lista mes")
            .located(By.xpath("//select[@id='birthMonth']"));

    public static final Target LIST_DAY = Target.the("selecciona la lista dia")
            .located(By.xpath("//select[@id='birthDay']"));
    public static final Target LIST_YEAR = Target.the("selecciona la lista año")
            .located(By.xpath("//select[@id='birthYear']"));
    public static final Target BTN_NEX = Target.the("click en el boton siguiente")
            .located(By.xpath("//span[contains(text(),'Next: Location')]"));



}
