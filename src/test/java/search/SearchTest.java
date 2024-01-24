//package search;
//
//import components.Header;
//import components.popups.SearchPopup;
//import factory.DriverFactory;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.WebDriver;
//import pages.MainPage;
//
//
//public class SearchTest {
//    //Объявляем приватную переменную объекта WebDriver
//   // WebDriver - это интерфейс в Selenium, который предоставляет методы для взаимодействия с веб-браузером.
//  private WebDriver driver;
//
////В данном случае ключевое слово `this` используется для
//// явного указания, что мы обращаемся к полю `driver`
//// объекта текущего класса `SerchTest`, что может быть полезно в случае,
//// если у нас есть другие переменные с тем же именем внутри метода или внутри блока кода.
//  @BeforeEach
//  public void init() {
//      this.driver = new DriverFactory().create();
//  }
//  @Test
//  public void searchLesson() {
//      // открыли страницу некую MainPage
//      new MainPage(driver).open("/");
//      SearchPopup searchPopup = new SearchPopup(driver);
//      searchPopup.popupShouldNotBeVisible();
//
//      new Header(driver).clickSearchButton();
//      searchPopup.popupShouldBeVisible();
//      searchPopup.enterSearchRequest("qa");
//
//// создаём класс специализация и проверяем, что страничка открыта
//  }
//}

//В данном методе `searchLesson()` происходит следующее:
//
//1. Создается новый объект `MainPage` с передачей в конструктор `driver` и вызывается метод `open("/")`, который открывает главную страницу.
//
//2. Создается новый объект `SearchPopup` с передачей `driver` в конструктор.
//
//3. Вызывается метод `popupShouldNotBeVisible()` у объекта `searchPopup`, который проверяет, что всплывающее окно поиска не видимо.
//
//4. Создается новый объект `Header` с передачей `driver` в конструктор.
//
//5. Вызывается метод `clickSearchButton()` у объекта `Header`, который выполняет некие действия для открытия всплывающего окна поиска.
//
//6. Вызывается метод `popupShouldBeVisible()` у объекта `searchPopup`, который проверяет, что всплывающее окно поиска видимо.
//
//7. Вызывается метод `enterSearchRequest("qa")` у объекта `searchPopup`, который вводит поисковой запрос "qa" в поле поиска всплывающего окна.
