package proyecto3.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ThirdPageForm {

    public static final Target CLICK = Target.the("Click en el dropdown").locatedBy("//div[@class='ui-select-container ui-select-bootstrap dropdown ng-empty ng-valid']//span[@class='btn btn-default form-control ui-select-toggle']//span[contains(text(),'Select Brand')]");
    public static final Target CLICK_2 = Target.the("Escojemos el elemento").locatedBy("//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']//span[@class='ui-select-choices-row-inner']//div[contains(text(),'Apple')]");

//    $x("//div[@class='ui-select-container ui-select-bootstrap dropdown ng-empty ng-valid']//span[contains(text(),'Select a Model')]")
    public static final Target CLICK_MODEL = Target.the("Escojemos el elemento").locatedBy("//div[@class='ui-select-container ui-select-bootstrap dropdown ng-empty ng-valid']//span[contains(text(),'Select a Model')]");
   //$x("//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']//span[@class='ui-select-choices-row-inner']//div[contains(text(),'iPhone 3GS')]")
    public static final Target CLICK_MODEL2 = Target.the("Escojemos el elemento").locatedBy("//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']//span[@class='ui-select-choices-row-inner']//div[contains(text(),'iPhone 3GS')]");

    //$x("//div[@class='ui-select-container ui-select-bootstrap dropdown ng-empty ng-valid']//span[@class='btn btn-default form-control ui-select-toggle']//span[contains(text(),'Select OS')]")
    public static final Target CLICK_SO = Target.the("Escojemos el elemento").locatedBy("//div[@class='ui-select-container ui-select-bootstrap dropdown ng-empty ng-valid']//span[@class='btn btn-default form-control ui-select-toggle']//span[contains(text(),'Select OS')]");

    //$x("//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']//span[@class='ui-select-choices-row-inner']//div[contains(text(),'iOS 3.0')]")

    public static final Target CLICK_SO2 = Target.the("Escojemos el elemento").locatedBy("//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']//span[@class='ui-select-choices-row-inner']//div[contains(text(),'iOS 3.0')]");

    //$x("//div[@class='pull-right next-step']//span[contains(text(),'Next: Last Step')]")
    public static final Target CLICK_SO2 = Target.the("Escojemos el elemento").locatedBy("//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu']//span[@class='ui-select-choices-row-inner']//div[contains(text(),'iOS 3.0')]");

}
