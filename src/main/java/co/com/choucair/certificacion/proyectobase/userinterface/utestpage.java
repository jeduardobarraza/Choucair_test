package co.com.choucair.certificacion.proyectobase.userinterface;

import net.bytebuddy.build.Plugin;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/signup/personal")
public class utestpage extends PageObject {
    public static final Target BUTTON_JOIN =Target.the("Button for open the form").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    public static final Target FIRST_NAME =Target.the("field for first name").located(By.id("firstName"));

    public static final Target LAST_NAME =Target.the("field for last name").located(By.id("lastName"));

    public static final Target EMAIL_ADRESS =Target.the("field for email address").located(By.id("email"));

    public static final Target MONTH =Target.the("field for month birth").located(By.xpath("//*[@id=\"birthMonth\"]"));

    public static final Target DAY =Target.the("field for day birth").located(By.xpath("//*[@id=\"birthDay\"]"));

    public static final Target YEAR =Target.the("field for year birth").located(By.xpath("//*[@id=\"birthYear\"]"));

    public static final Target BUTTON_NEXT_LOCATION =Target.the("Button for next: location").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

    public static final Target CITY =Target.the("field for city").located(By.id("city"));

    public static final Target POSTAL =Target.the("field for postal code").located(By.id("zip"));

    public static final Target COUNTRY =Target.the("field for country").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));

    public static final Target BUTTON_NEXT_DEVICES =Target.the("Button for next devices").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));

    public static final Target MOBILE_DEVICE =Target.the("field for mobile device").located(By.cssSelector("input[value='Xiaomi']"));

    public static final Target MODEL =Target.the("field for model").located(By.cssSelector("input[value='Redmi 10']"));

    public static final Target OPER_SYSTEM =Target.the("field for operative system").located(By.cssSelector("input[value='Android 11']"));

    public static final Target BUTTON_NEXT_LASTSTEP =Target.the("Button for next last step").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));



    public static final Target PASSWORD =Target.the("field for password").located(By.id("password"));

    public static final Target CONFIRM_PASSWORD =Target.the("field for confirm password").located(By.id("confirmPassword"));

    public static final Target STAY_INFORMED =Target.the("checkbox for stay informed").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target TERMS =Target.the("checkbox for Utest terms").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target POLICY =Target.the("checkbox for policy").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_COMPLETE =Target.the("Button for complete").located(By.xpath("//*[@id=\"laddaBtn\"]/span"));


}
