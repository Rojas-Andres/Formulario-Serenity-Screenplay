package proyecto3.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import proyecto3.userinterface.FourthPageForm;
import proyecto3.userinterface.ThirdPageForm;

public class FourthPart implements Task {
    private String strPassword;

    public FourthPart(String strPassword) {
        this.strPassword=strPassword;
    }

    public static FourthPart the(String strPassword){
        return Tasks.instrumented(FourthPart.class,strPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(strPassword).into(FourthPageForm.PASSWORD),
                Enter.theValue(strPassword).into(FourthPageForm.PASSWORD2),
                Click.on(FourthPageForm.CLICK_USE_TERM),
                Click.on(FourthPageForm.CLICK_PRIVACITY),
                Click.on(FourthPageForm.CLICK_END_FORM)

                );
    }
}
