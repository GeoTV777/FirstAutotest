package factory.settings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

public class ChromeDriverSettings implements IDriverSettings {
    //Блок нестатической инициализации выполняет настройку
    // WebDriver для работы с Chrome перед использованием экземпляра класса(до исп-я конструктора).
    {
        WebDriverManager.chromedriver().setup();
    }
    @Override
    public AbstractDriverOptions settings() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sanbox");
        chromeOptions.addArguments("--no-first-run");
        chromeOptions.addArguments("--enable- extension");
        chromeOptions.addArguments("--homepage=about:blank");
        chromeOptions.addArguments("--ignore-certificate-errors");

        return chromeOptions;

    }
}
