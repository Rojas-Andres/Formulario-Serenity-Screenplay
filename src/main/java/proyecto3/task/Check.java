package proyecto3.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import proyecto3.userinterface.CheckPage;
import proyecto3.userinterface.FirstPageForm;

public class Check implements Task{
    private String email;
    private String password;
    public Check(String email, String lastname) {
        this.email=email;
        this.password=password;
    }

    public static Check the(String email, String password){
        return Tasks.instrumented(Check.class,email,password);
    }


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(CheckPage.CLICK_LOG_IN),
                Enter.theValue(email).into(CheckPage.ENTER_USER),
                Enter.theValue(password).into(CheckPage.ENTER_PASSWORD),
                Click.on(CheckPage.CLICK_SIGN_IN)

                );
    }
}
