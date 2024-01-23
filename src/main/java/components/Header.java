package components;

import common.AbsCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header extends AbsCommon {
    public Header(WebDriver driver){
        super(driver);
    }

    public void clickSearchButton() {
        driver.findElement(By.cssSelector("s")).click();
    }


}
