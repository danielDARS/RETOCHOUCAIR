package com.utest.StepsDefinitions;

import com.utest.questions.ValidacionCrear;
import com.utest.tasks.RegistroTask;
import com.utest.usersInterfaces.RegistroPage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegistroStesps {

    @Managed(driver = "Chrome")
    private WebDriver navegador;
    private Actor usuario = Actor.named("usuario");

    RegistroPage registroPage = new RegistroPage();

    @Before
    public void configuracion() {
        usuario.can(BrowseTheWeb.with(navegador));

    }


    @Dado("que el usuario se encuentre en la pagina web")
    public void queElUsuarioSeEncuentreEnLaPaginaWeb() {
        usuario.wasAbleTo(Open.browserOn(registroPage));
    }


    @Cuando("el usuario llene todo el formulario")
    public void elUsuarioLleneTodoElFormulario() {
        usuario.attemptsTo(RegistroTask.Registro());
    }
    @Entonces("visualizara mensaje de bienbenida")
    public void visualizaraMensajeBeVienbenida() {
        usuario.should(seeThat("el actor puede ver", ValidacionCrear.validar(), Matchers.equalTo(true)));

    }
}
