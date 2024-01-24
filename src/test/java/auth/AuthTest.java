//package auth;
//
//import factory.DriverFactory;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.core.Logger;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.WebDriver;
//import tools.WaitTools;
//
//public class AuthTest {
//    private Logger logger = (Logger) LogManager.getLogger("FirstAutotest");
//    private String login= System.getProperty("login");
//    private String password= System.getProperty("password");
//    private WebDriver driver;
//    private WaitTools waitTools;
//    private String baseUrl = System.getProperty("base.url");
//
//    @BeforeEach
//    public void init() {
//        driver = new DriverFactory("--start-maximized").create();
//        waitTools = new WaitTools(driver);
//        driver.get(baseUrl);
//        logger.info("Open browser in maximized");
//    }
//
//    @AfterEach
//    public void driverStop() {
//        if (driver != null) {
//            logger.info("Close browser");
//            driver.close();
//            driver.quit();
//        }
//    }
//    @Test
//    public void autorization() {}
//}
