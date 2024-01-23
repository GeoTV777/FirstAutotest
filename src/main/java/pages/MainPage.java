package pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends AbsBasePage {
    // вызываем конструктор родителя
    // необходимо делать всегда,когда переопределяется конструктор родителя
    public MainPage(WebDriver driver) {
        super(driver);
    }
}
