package proyecto3.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
public class Check implements Task{

    public Check(String email, String lastname) {
        this.email=email;
        this.password=password;
    }

    public static Check the(String email, String password){
        return Tasks.instrumented(FirstPart.class,email,password);
    }
}
