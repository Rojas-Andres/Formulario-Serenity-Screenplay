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
    private String strEmail;
    private String strPassword;
    public Check(String strEmail, String strPassword) {
        this.strEmail=strEmail;
        this.strPassword=strPassword;
    }

    public static Check the(String strEmail, String strPassword){
        return Tasks.instrumented(Check.class,strEmail,strPassword);
    }


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(CheckPage.CLICK_LOG_IN),
                Enter.theValue(strEmail).into(CheckPage.ENTER_USER),
                Enter.theValue(strPassword).into(CheckPage.ENTER_PASSWORD),
                Click.on(CheckPage.CLICK_SIGN_IN)

                );
    }
}
