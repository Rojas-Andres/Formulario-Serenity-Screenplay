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
    private String strName;
    private String strLastname;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    public FirstPart(String strName,String strLastname, String strEmail,String strMonth, String strDay, String strYear){
        this.strName = strName ;
        this.strLastname=strLastname;
        this.strEmail=strEmail;
        this.strMonth=strMonth;
        this.strDay=strDay;
        this.strYear=strYear;
    }

    public static FirstPart the(String strName,String strLastname, String strEmail,String strMonth,String strDay, String strYear){
        return Tasks.instrumented(FirstPart.class,strName,strLastname,strEmail,strMonth,strDay,strYear);
    }


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(FirstPageForm.CLICK_JOIN_TODAY),
                Enter.theValue(strName).into(FirstPageForm.FIRST_NAME),
                Enter.theValue(strLastname).into(FirstPageForm.LAST_NAME),
                Enter.theValue(strEmail).into(FirstPageForm.EMAIL),
                SelectFromOptions.byVisibleText(strMonth).from(FirstPageForm.MONTH),
                SelectFromOptions.byVisibleText(strDay).from(FirstPageForm.DAY),
                SelectFromOptions.byVisibleText(strYear).from(FirstPageForm.YEAR),
                Click.on(FirstPageForm.CLICK_NEXT)



        );
    }
}
