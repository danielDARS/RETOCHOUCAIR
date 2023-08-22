package com.utest.Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/Registro.feature",
        glue = "com.utest.StepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class RegistroRunner {
}
