package proyecto3.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SecondPageForm {

    public static final Target CLICK_NEXT = Target.the("Siguiente parte").located(By.xpath("//div[@class='pull-right next-step']//span"));
    public static final Target CHOICE_CITY = Target.the("Escogiendo Ciudad").located(By.xpath("//input[@id='city']"));
    public static final Target CHOICE_ZIP_CODE = Target.the("Escogiendo Codigo Postal").located(By.xpath("//input[@id='zip']"));

}
