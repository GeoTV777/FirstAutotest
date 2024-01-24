package components.popups;

import common.AbsCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.junit.jupiter.api.Assertions;

public class SearchPopup extends AbsCommon implements IPopap {

    public SearchPopup(WebDriver driver) {
        super(driver);

    }
    //динамический локатор
    private String serchInputPopupLocatop = "//div[./input[@type=''search]]";

    @Override
    public void popupShouldNotBeVisible() {
        Assertions.assertTrue(waitTools.waitNotElementPresent(By.xpath(serchInputPopupLocatop)), "");
    }

    @Override
    public void popupShouldBeVisible() {
        Assertions.assertTrue(waitTools.waitElementPresent(By.xpath(serchInputPopupLocatop)), "");
    }
    public void enterSearchRequest(String search) {
        driver.findElement(By.xpath(serchInputPopupLocatop)).sendKeys(search);
        actions.sendKeys(Keys.ENTER).build().perform();
    }

}

