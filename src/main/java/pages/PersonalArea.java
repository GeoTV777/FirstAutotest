package pages;

import org.openqa.selenium.WebDriver;

public class PersonalArea extends AbsBasePage {
    // вызываем конструктор родителя
    // необходимо делать всегда,когда переопределяется конструктор родителя
    public PersonalArea (WebDriver driver) {
        super(driver);
    }
}
