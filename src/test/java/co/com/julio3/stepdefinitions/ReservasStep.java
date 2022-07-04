package co.com.julio3.stepdefinitions;

import co.com.julio3.interactions.Esperar;
import co.com.julio3.interactions.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ReservasStep {

    @Managed
    static
    WebDriver myDriver;
    @Before
    public static void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        theActorCalled("David").can(BrowseTheWeb.with(myDriver));
    }

    @Given("^que (.*) abre la pagina continentalgold$")
    public void abreLaPaginaContinentalgold(String actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomePage.enPagina(),
        Esperar.unTiempo(5000)
        );



    }


    @When("^el entra a la ventana de reservas$")
    public void elEntraAReservas() {


    }

    @Then("^se vera mensaje de acceso exitoso$")
    public void accesoExitoso() {

    }

}
