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
    private String password;

    public FourthPart(String password) {
        this.password=password;
    }

    public static FourthPart the(String password){
        return Tasks.instrumented(FourthPart.class,password);
    }


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(password).into(FourthPageForm.PASSWORD),
                Enter.theValue(password).into(FourthPageForm.PASSWORD2),
                Click.on(FourthPageForm.CLICK_USE_TERM),
                Click.on(FourthPageForm.CLICK_PRIVACITY)

                );
    }
}
