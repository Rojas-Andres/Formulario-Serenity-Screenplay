package proyecto3.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckPage {
    //$x("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(),'Log In')]")
    public static final Target CLICK_LOG_IN = Target.the("Click en LOG IN ").locatedBy("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(),'Log In')]");
    public static final Target ENTER_USER = Target.the("Colocar email").located(By.id("username"));
    public static final Target ENTER_PASSWORD = Target.the("Colocar Contraseña").located(By.id("password"));
    //$x("//div[@id='kc-form-buttons']//button[contains(text(),'Sign in')]")


    public static final Target CLICK_SIGN_IN = Target.the("Click para entrar").locatedBy("//div[@id='kc-form-buttons']//button[contains(text(),'Sign in')]");


}
