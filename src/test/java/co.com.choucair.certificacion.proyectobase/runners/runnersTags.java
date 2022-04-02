package co.com.choucair.certificacion.proyectobase.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.graalvm.compiler.api.replacements.Snippet;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="C:/Users/jedua/IdeaProjects/co.com.choucair.certification.[primerproyecto]/src/test/resources/features/academyChoucair.feature",
        tags= "@Regression",
        glue= "co.com.choucair.certificacion.proyectobase.stepdefinitions",
        snippets= SnippetType.CAMELCASE
)

public class runnersTags {
}
