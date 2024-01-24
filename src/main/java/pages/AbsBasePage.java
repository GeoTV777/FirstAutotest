package pages;

import common.AbsCommon;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public abstract class AbsBasePage extends AbsCommon {
    private String BASE_URL = System.getProperty("base.url");
    //Конструктор класса `AbsBasePage` принимает объект `WebDriver`
    // в качестве параметра и вызывает конструктор суперкласса `AbsCommon`,
    // передавая ему этот объект.
     public AbsBasePage(WebDriver driver) {
         super(driver);
     }
    public void open() {
        driver.get(BASE_URL);
    }
    //перегрузка метода open с указанием брейкпоинта(дополнения к урлу)
    public void open(String path) {
        driver.get(BASE_URL + path);
    }
}
