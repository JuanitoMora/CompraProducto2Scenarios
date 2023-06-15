package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;

import static ui.DetallesProducto.*;

public class AgregarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (Visibility.of(POP_UP_PRIME).viewedBy(actor).asBoolean()){
            actor.attemptsTo(Click.on(POP_UP_PRIME));
        }

        actor.attemptsTo(

                Click.on(SELECT_CANT),//Añadir con clic 1 unidad más
                Click.on(SELECT_CANT),//Añadir con clic 1 unidad más
                Click.on(BUTTON_ADD),//Seleccionar añadir a la cesta
                Click.on(BUTTON_GO_TO_CART)//Seleccionar ir la cesta
        );
    }

    public static AgregarProducto cantidad() {
        return Tasks.instrumented(AgregarProducto.class);
    }
}
