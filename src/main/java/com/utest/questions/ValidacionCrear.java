package com.utest.questions;

import com.utest.usersInterfaces.ValidacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCrear implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return ValidacionPage.TXT_VALIDACION.resolveFor(actor).isVisible();

    }
    public static Question validar(){

        return new ValidacionCrear();
    }
}
