package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.farmatodo.com.co/")
public class HomePage extends PageObject {

    public static final Target POP_UP_INITIAL = Target.the("Cerrar Popup").located(By.xpath("/html/body/div[1]/div[2]/button"));
    public static final Target WRITE_PRODUCT = Target.the("Escribir el producto").located(By.id("nav-bar-algolia-search-box"));
    public static final Target SELECT_PRODUCT = Target.the("Seleccionando producto").located(By.xpath("//*[@id=\"ADDED_FROM_SEARCH-229900074-detail-redirect\"]/a"));

}
