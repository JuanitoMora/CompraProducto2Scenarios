package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.questions.Visibility;
import org.openqa.selenium.Keys;

import static ui.HomePage.*;

public class BuscarProducto implements Task {
    private String description;

    public BuscarProducto(String description) {
        this.description = description;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (Visibility.of(POP_UP_INITIAL).viewedBy(actor).asBoolean()){
            actor.attemptsTo(Click.on(POP_UP_INITIAL));
        }
        actor.attemptsTo(

                Click.on(WRITE_PRODUCT),//Situarse en el campo
                Enter.theValue(description).into(WRITE_PRODUCT),//Diligenciar campo de búsqueda
                Hit.the(Keys.ENTER).into(WRITE_PRODUCT),//Presionar Enter
                Click.on(SELECT_PRODUCT)//Seleccionar producto a agregar
        );
    }

    public static BuscarProducto conDescription(String description) {
        return Tasks.instrumented(BuscarProducto.class, description);
    }
}
