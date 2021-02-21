package proyecto3.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class FourthPageForm {
    //Los comentarios son para probar que si lo encontrara eso se puede colocar por el inspect y console
    public static final Target PASSWORD = Target.the("Elegimos la contraseña").locatedBy("//input[@id='password']");
    public static final Target PASSWORD2 = Target.the("Confirmamos la contraseña").locatedBy("//input[@id='confirmPassword']");
    //$x("//label[@class='input-check-box signup-consent']//span[contains(@class,'checkmark signup-consent__checkbox error')]")
    //public static final Target CLICK_PRIVACITY = Target.the("Escojemos el modelo").locatedBy("//label[@class='input-check-box signup-consent']//span[contains(@class,'checkmark signup-consent__checkbox error')]");
    //$x("//label[@class='input-check-box signup-consent']//span[contains(@ng-class,'{error: userForm.termOfUse.$error.required}')]")
    public static final Target CLICK_USE_TERM = Target.the("Aceptamos terminos").locatedBy("//label[@class='input-check-box signup-consent']//span[contains(@ng-class,'{error: userForm.termOfUse.$error.required}')]");
    //$x("//label[@class='input-check-box signup-consent']//span[contains(@ng-class,'{error: userForm.privacySetting.$error.required}')]")
    public static final Target CLICK_PRIVACITY = Target.the("Aceptamos terminos").locatedBy("//label[@class='input-check-box signup-consent']//span[contains(@ng-class,'{error: userForm.privacySetting.$error.required}')]");
    //$x("//div[@class='pull-right next-step']//span[contains(text(),'Complete Setup')]")
    public static final Target CLICK_END_FORM = Target.the("Terminamos el Formulario").locatedBy("//div[@class='pull-right next-step']//span[contains(text(),'Complete Setup')]");


}
