package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_COURSE = Target.the("Link to access the course")
            .located(By.id("certificaciones"));
    public static final Target INPUT_COURSE = Target.the("Field for searching courses")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Button to do the search")
            .located(By.xpath("//button[contains(@class,'btn btn-secondary')]"));
    public static final Target SELECT_COURSE = Target.the("Click on the course")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
    public static final Target NAME_COURSE = Target.the("Name of course")
            .located(By.xpath("/html/body/div[1]/div[2]/div/header/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));

}

