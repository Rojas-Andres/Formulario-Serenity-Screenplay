package proyecto3.task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.Open;
import proyecto3.userinterface.UtestPage;

public class OpenUp implements Task{
    private UtestPage utestPage;
    public static OpenUp thePage(){
        return Tasks.instrumented(OpenUp.class);
    }
    //Abrimos la pagina utest.com
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(utestPage));
    }

}
