package proyecto3.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import proyecto3.userinterface.FirstPageForm;
import proyecto3.userinterface.ThirdPageForm;

public class ThirdPart implements Task{
    private String mobile;

    public ThirdPart(String mobile) {
        this.mobile=mobile;
    }

    public static ThirdPart the(String mobile){
        return Tasks.instrumented(ThirdPart.class,mobile);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(ThirdPageForm.CLICK),
                Click.on(ThirdPageForm.CLICK_2),
                Click.on(ThirdPageForm.CLICK_MODEL),
                Click.on(ThirdPageForm.CLICK_MODEL2),
                Click.on(ThirdPageForm.CLICK_SO),
                Click.on(ThirdPageForm.CLICK_SO2),
                Click.on(ThirdPageForm.CLICK_NEXT)
                //Enter.theValue().into().
                //SelectFromOptions.byVisibleText("Lenovo").from(ThirdPageForm.CLICK)

                );
    }
}
