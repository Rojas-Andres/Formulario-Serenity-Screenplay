package proyecto3.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SecondPageForm {

    public static final Target CLICK_NEXT = Target.the("Siguiente parte").located(By.xpath("//div[@class='pull-right next-step']//span"));


}
