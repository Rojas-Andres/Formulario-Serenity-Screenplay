package proyecto3.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import proyecto3.userinterface.FirstPageForm;
import org.openqa.selenium.support.ui.Select;

public class FirstPart implements Task {
    private String name;
    private String lastname;
    private String email;
    private String month;
    private String day;
    private String year;
    public FirstPart(String name,String lastname, String email,String month, String day, String year){
        this.name = name ;
        this.lastname=lastname;
        this.email=email;
        this.month=month;
        this.day=day;
        this.year=year;
    }

    public static FirstPart the(String name,String lastname, String email,String month,String day, String year){
        return Tasks.instrumented(FirstPart.class,name,lastname,email,month,day,year);
    }


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(FirstPageForm.CLICK_JOIN_TODAY),
                Enter.theValue(name).into(FirstPageForm.FIRST_NAME),
                Enter.theValue(lastname).into(FirstPageForm.LAST_NAME),
                Enter.theValue(email).into(FirstPageForm.EMAIL),
                SelectFromOptions.byVisibleText(month).from(FirstPageForm.MONTH),
                SelectFromOptions.byVisibleText(day).from(FirstPageForm.DAY),
                SelectFromOptions.byVisibleText(year).from(FirstPageForm.YEAR),
                Click.on(FirstPageForm.CLICK_NEXT)



        );
    }
}
