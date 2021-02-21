package proyecto3.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FirstPageForm {

    public static final Target CLICK_JOIN_TODAY = Target.the("Click para iniciar el formulario").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target FIRST_NAME = Target.the("Digitamos el nombre").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Digitamos el apellido").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Digitamos el correo").located(By.id("email"));
    public static final Target MONTH = Target.the("Escogemos el mes").located(By.cssSelector("select#birthMonth"));
    public static final Target DAY = Target.the("Escogemos el dia").located(By.cssSelector("select#birthDay"));
    public static final Target YEAR = Target.the("Escogemos el año").located(By.cssSelector("select#birthYear"));
    public static final Target CLICK_NEXT = Target.the("Siguiente parte").located(By.xpath("//div[@class='form-group col-xs-12 text-right']//span"));

}
