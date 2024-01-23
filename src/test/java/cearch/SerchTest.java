package cearch;

import factory.DriverFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class SerchTest {
    //Объявляем приватную переменную объекта WebDriver
   // WebDriver - это интерфейс в Selenium, который предоставляет методы для взаимодействия с веб-браузером.
  private WebDriver driver;

//В данном случае ключевое слово `this` используется для
// явного указания, что мы обращаемся к полю `driver`
// объекта текущего класса `SerchTest`, что может быть полезно в случае,
// если у нас есть другие переменные с тем же именем внутри метода или внутри блока кода.
  @BeforeEach
  public void init() {
      this.driver = new DriverFactory().create();
  }
  @Test
  public void searchLesson() {
      // открыли страницу некую MainPage
      new MainPage(driver).open("/");

  }
}
