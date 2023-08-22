package com.utest.tasks;

import com.utest.utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import static com.utest.usersInterfaces.UltimoPasoPage.*;
import static com.utest.usersInterfaces.DispositivosPage.*;
import static com.utest.usersInterfaces.RegistroPage.*;
import static com.utest.usersInterfaces.DireccionPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;


public class RegistroTask implements Task {

    Datos datos = new Datos();


    @Override
    public <T extends Actor> void performAs(T actor) {

        int randomMonthNumber = ThreadLocalRandom.current().nextInt(1, 13);
        String randomMonthValue = "number:" + randomMonthNumber;
        int randomDayNumber = ThreadLocalRandom.current().nextInt(1, 31);
        String randomDayValue = "number:" + randomDayNumber;
        int randomYearNumber = ThreadLocalRandom.current().nextInt(1992, 2006);
        String randomYearValue = "number:" + randomYearNumber;
        try {

            actor.attemptsTo(


                    Click.on(BTN_JOIN_TODAY),
                    Enter.theValue(datos.leerDatosExcel("chouc.xlsx","Hoja1",1,0)).into(TXT_FIRS_NAME),
                    Enter.theValue(datos.leerDatosExcel("chouc.xlsx","Hoja1",1,1)).into(TXT_LAST_NAME),
                    Enter.theValue(datos.leerDatosExcel("chouc.xlsx","Hoja1",1,2)).into(TXT_EMAIL),
                    WaitUntil.the(LIST_MONTH, isCurrentlyEnabled()).forNoMoreThan(20).seconds(),

                    SelectFromOptions.byValue(randomMonthValue).from(LIST_MONTH),
                    SelectFromOptions.byValue(randomDayValue).from(LIST_DAY),
                    SelectFromOptions.byValue(randomYearValue).from(LIST_YEAR),

                    Click.on(BTN_NEX)

                    );

            actor.attemptsTo(

                    Clear.field(TXT_CITY),
                    Enter.theValue(datos.leerDatosExcel("chouc.xlsx","Hoja1",1,3)).into(TXT_CITY),
                    Clear.field(TXT_ZIP),
                    Enter.theValue(datos.leerDatosExcel("chouc.xlsx","Hoja1",1,4)).into(TXT_ZIP),
                    Click.on(BTN_NEX2)
                    );

            actor.attemptsTo(
                    Click.on(LIST_COMPUTER),
                    Click.on(LIST_LINUX),
                    Click.on(LIST_VERSION),
                    Click.on(LIST_FEDORA),
                    Click.on(LIST_LANGUAGE),
                    Click.on(LIST_BULGARIAN),
                    Click.on(LIST_MOBILE),
                    Click.on(LIST_APPLE),
                    Click.on(LIST_MODEL),
                    Click.on(LIST_IPAD13G),
                    Click.on(LIST_SYSTEM),
                    Click.on(LIST_IOS_4_3_1),
                    Click.on(BTN_NEX3)

                    );
            actor.attemptsTo(
                    Enter.theValue(datos.leerDatosExcel("chouc.xlsx","Hoja1",1,5)).into(TXT_PASSWORD),
                    Enter.theValue(datos.leerDatosExcel("chouc.xlsx","Hoja1",1,5)).into(TXT_CONFIRM_PASSWORD),
                    Click.on(BTN_TERMINOS),
                    Click.on(BTN_POLITICAS),
                    Click.on(BTN_COMPLETE)


                    );

        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static RegistroTask Registro (){
        return instrumented (RegistroTask.class);
    }
}
