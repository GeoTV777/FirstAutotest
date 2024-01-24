package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import tools.WaitTools;

public abstract class AbsCommon {
    protected WebDriver driver;
    protected WaitTools waitTools;
    protected Actions actions;
    // создаётся конструктор класса AbsCommon, который принимает объект WebDriver в качестве параметра
    public AbsCommon(WebDriver driver){
        this.driver = driver;
        waitTools = new WaitTools(driver);
        this.actions = new Actions(driver);
    }
    //  в методеAbsCommon
// 1 переменная this.driver  принимает значение переданного объекта  WebDriver для
// взаимодействия класса AbsCommon с браузером
// 2 Создаётся объект класса waitTools  с использованием переданного объекта WebDriver.
//  Этот объект предоставляет набор методов для ожидания различных условий во время выполнения тестов.
// 3 И создаётся объект класса  Action c  использованием переданного объекта  WebDriver. Этот объект предоставляет
// методы для выполнения различных действий с элементами на веб-странице (клик, перетаскивание, двойной клик)
    public void clickWithScroll(By locator){

    }

}

