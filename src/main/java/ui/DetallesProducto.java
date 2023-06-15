package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetallesProducto extends PageObject {
    public static final Target SELECT_CANT = Target.the("Seleccionar cantidad").located(By.xpath("//*[@id=\"add-quantity-229900074\"]"));public static final Target WRITE_CANT = Target.the("Diligenciar cantidad").locatedBy("//*[@id=\"testId-input-product-quantity-desktop\"]");
    public static final Target BUTTON_ADD = Target.the("Agregar al carro").locatedBy("//*[@id=\"app-component-router-outlet\"]/div/div/app-product-detail/div/div[1]/div[2]/div[4]/div[5]/div[1]/app-button/button");
    public static final Target POP_UP_PRIME = Target.the("Pop Up Prime").locatedBy("//button[@class=\"ab-close-button\"]");

    public static final Target BUTTON_GO_TO_CART = Target.the("Ir al carro").locatedBy("#nav-bar-cart-redirect > img");

}
