package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import io.cucumber.datatable.DataTable;

import org.openqa.selenium.WebDriver;
import tasks.AgregarProducto;
import tasks.BuscarProducto;
import ui.CarroCompras;
import ui.HomePage;

public class GlobalQAStepDefinitions {
    private WebDriver navegador;
    private Actor actor = Actor.named("Bender");
    private HomePage homePage = new HomePage();

    @Given("un nuevo cliente accede hasta la web de compras")
    public void unNuevoClienteAccedeHastaLaWebDeCompras() {
        actor.whoCan(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @When("el agrega las unidades de {string} al carro")
    public void elAgregaLasUnidadesDeAlCarro(String product) {
        actor.wasAbleTo(BuscarProducto.conDescription(product),
                AgregarProducto.cantidad());
    }

    @Then("el ve los productos listados en el carro de compras")
    public void elVeLosProductosListadosEnElCarroDeCompras() {
        actor.should(seeThat(the(CarroCompras.SEE_PRODUCT), isPresent()));
    }

    @When("el agrega un producto al carro")
    public void el_agrega_un_producto_al_carro(DataTable productInformation) {
        System.out.println("@When");
    }
}
