package components;

import common.AbsCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header extends AbsCommon {
    public Header(WebDriver driver){
        super(driver);
    }

//    public void clickSearchButton() {
//        driver.findElement(By.xpath("(//nav/div/div[./[not)(self::div)]])[1]")).click();
//    }

    public void clickSignInButton() {
        driver.findElement(By.xpath("//button[text()='Войти']"));
    }

}
