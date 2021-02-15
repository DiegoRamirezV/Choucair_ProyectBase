package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));

    public static final Target INPUT_USER = Target.the("Flied where the user should to write the username")
            .located(By.id("username"));

    public static final Target INPUT_PASSWORD = Target.the("Flied where the user should to write the password")
            .located(By.id("password"));

    public static final Target ENTER_BUTTON = Target.the("Button to confirm the login")
            .located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
