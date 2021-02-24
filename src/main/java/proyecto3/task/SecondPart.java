package proyecto3.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.ClearElement;

import proyecto3.userinterface.SecondPageForm;

public class SecondPart implements Task{
    private String strCity;
    private String strZipCode;

    public SecondPart(String strCity, String strZipCode) {
        this.strCity=strCity;
        this.strZipCode=strZipCode;

    }

    public static SecondPart the(String strCity,String strZipCode){
        return Tasks.instrumented(SecondPart.class,strCity,strZipCode);
    }


    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(
                //Escogiendo la ciudad
                Enter.theValue(strCity).into(SecondPageForm.CHOICE_CITY),
                Hit.the(Keys.DOWN).into(SecondPageForm.CHOICE_CITY),
                Hit.the(Keys.ENTER).into(SecondPageForm.CHOICE_CITY),
                //Escogemos el codigo postal
                Enter.theValue(strZipCode).into(SecondPageForm.CHOICE_ZIP_CODE),
                //El pais no es necesario porque cuando se cambia la ciudad coje el pais por defecto
                Click.on(SecondPageForm.CLICK_NEXT)

        );
    }
}
