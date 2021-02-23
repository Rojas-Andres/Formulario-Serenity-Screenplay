package proyecto3.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.remote.server.handler.ClearElement;

import proyecto3.userinterface.SecondPageForm;

public class SecondPart implements Task{
    private String strCity;
    public SecondPart(String strCity) {
        this.strCity=strCity;
    }

    public static SecondPart the(String strCity){
        return Tasks.instrumented(SecondPart.class,strCity);
    }


    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(

                //Intente borrar el texto para llenarlo nuevamente
                //Clear.field(SecondPageForm.ENTER_CITY5),
                //SelectFromOptions.byVisibleText("Bogota").from(SecondPageForm.ENTER_CITY4),
                Click.on(SecondPageForm.CLICK_NEXT)
                //Con varios located
                /*
                Enter.theValue("Bogota").into(SecondPageForm.ENTER_CITY),
                Enter.theValue("Bogota").into(SecondPageForm.ENTER_CITY2),
                Enter.theValue("Bogota").into(SecondPageForm.ENTER_CITY3),
                Enter.theValue("Bogota").into(SecondPageForm.ENTER_CITY5),

                Enter.theValue("76001").into(SecondPageForm.ENTER_POSTAL),
                Enter.theValue("Colombia").into(SecondPageForm.ENTER_POSTAL)

                */
                //SelectFromOptions.byVisibleText("Cali").from(SecondPageForm.CLICK_CITY)
        );
    }
}
