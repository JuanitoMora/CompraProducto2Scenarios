package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarroCompras {

    public static final Target SEE_PRODUCT = Target.the("Ver producto en carro de compras").located(By.xpath("//p[contains(text(),'KN95 Blanco')]"));
}
