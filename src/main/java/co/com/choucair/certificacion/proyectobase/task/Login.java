package co.com.choucair.certificacion.proyectobase.task;

import co.com.choucair.certificacion.proyectobase.userinterface.utestpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class Login implements Task {
    public static Performable onthepage() {
        return Tasks.instrumented(login.class);
    }

    @Override
    public <T extends Actor> void performAs(T Actor){
        Actor.attemptsTo(Click.on(utestpage.BUTTON_JOIN),
                Enter.theValue("Jesus Eduardo").into(utestpage.FIRST_NAME),
                Enter.theValue("Barraza Pava").into(utestpage.LAST_NAME),
                Enter.theValue("jeduardo.barraza@gmail.com").into(utestpage.EMAIL_ADRESS),
                Enter.theValue("June").into(utestpage.MONTH),
                Enter.theValue("20").into(utestpage.DAY),
                Enter.theValue("1992").into(utestpage.YEAR),
                Click.on(utestpage.BUTTON_NEXT_LOCATION),
                Enter.theValue("Cartagena").into(utestpage.CITY),
                Enter.theValue("130001").into(utestpage.POSTAL),
                Enter.theValue("Colombia").into(utestpage.COUNTRY),
                Click.on(utestpage.BUTTON_NEXT_DEVICES),
                Enter.theValue("Xiaomi").into(utestpage.MOBILE_DEVICE),
                Enter.theValue("Redmi 10").into(utestpage.MODEL),
                Enter.theValue("Android 11").into(utestpage.OPER_SYSTEM),
                Click.on(utestpage.BUTTON_NEXT_LASTSTEP),
                Enter.theValue("123Abc123#").into(utestpage.PASSWORD),
                Enter.theValue("123Abc123#").into(utestpage.CONFIRM_PASSWORD),
                Click.on(utestpage.STAY_INFORMED),
                Click.on(utestpage.TERMS),
                Click.on(utestpage.POLICY),
                Click.on(utestpage.BUTTON_COMPLETE)
        );

    }
}

