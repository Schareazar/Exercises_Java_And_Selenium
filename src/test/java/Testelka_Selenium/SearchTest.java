package Testelka_Selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class SearchTest extends BaseTest {

//    Napisz test (fakestore.testelka.pl), w którym używając szukajki w prawym górnym rogu,
//    poszukasz produktów na hasło “wspinaczka”,a potem potwierdzisz, że liczba wyników to dwa i że oba mają „wspinaczka w nazwie”.
//    Hint: żeby potwierdzić wyszukiwanie (robiąc to ręcznie wcisnęlibyśmy enter) wykonaj metodę submit()
//    na szukajce (czyli na elemencie o tagu input) albo na całym formularzu (szukajka znajduje się w elemencie o tagu form).

    @Test
    public void searchBoxWorks() {
        driver.get(baseUrl);
        driver.findElement(By.className("search-field")).sendKeys("wspinaczka");
        driver.findElement(By.className("search-field")).submit();

        Assertions.assertAll(
                () -> Assertions.assertEquals(2,
                        driver.findElements(By.className("woocommerce-LoopProduct-link")).size()),
                () -> Assertions.assertTrue(driver.findElements(By.className("woocommerce-loop-product__title")).
                        get(0).getText().toLowerCase().contains("wspinaczka")),
                () -> Assertions.assertTrue(driver.findElements(By.className("woocommerce-loop-product__title")).
                        get(1).getText().toLowerCase().contains("wspinaczka"))
        );
    }
}
