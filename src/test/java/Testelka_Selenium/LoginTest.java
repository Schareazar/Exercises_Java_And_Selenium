package Testelka_Selenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

//    Zadanie 1: logowanie
//    Najpierw załóż konto na fakestore.testelka.pl: https://fakestore.testelka.pl/moje-konto/.
//    Nazwę użytkownika zobaczysz po zalogowaniu.
//    Następnie napisz test, w którym przetestujesz pozytywny przypadek logowania
//    (czyli, że wprowadzając prawidłowe hasło i użytkownika rzeczywiście się zalogujesz).

    @Test
    void loginWithCorrectData() {
        String email = "test@test.test";
        String password = "testTEST123$%^";
        String username = "test-9335";

        driver.get(baseUrl + "moje-konto/");
        driver.findElement(By.id("username")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.name("login")).click();

        Assertions.assertTrue(driver.findElement(By.className("woocommerce-MyAccount-content"))
                .getText().contains(username));
    }
}
