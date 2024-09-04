package Testelka_Selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Optional;

public class SortingByPriceTest extends BaseTest {

//    Przetestuj filtrowanie po cenie (na stronie kategorii np. https://fakestore.testelka.pl/product-category/windsurfing/).
//    Napisz dwa testy: jeden dla sortowania po cenie od najniższej do najwyższej, drugi od najwyższej do najniższej.
//    Założenie: wiesz jaka jest najniższa i najwyższa cena.
//    W tym zadaniu w asercji posługuj się stringami (nie musisz parsować stringów do typu liczbowego).

    private void sortBy(String sortOption) {
        Select select = new Select(find(By.className("orderby")));
        select.selectByVisibleText(sortOption);
//        List<WebElement> sortOptions = select.getOptions();
//        Optional<WebElement> sort = sortOptions.stream()
//                .filter(option -> option.getText().equals(sortOption))
//                .findAny();
//        sort.ifPresent(WebElement::click);
    }

    @Test
    public void SortingLowToHighTest() {
        driver.get(baseUrl + "product-category/windsurfing/");
        sortBy("Sortuj wg ceny: od najniższej");

        Assertions.assertEquals("2 900,00 zł", find(By.className("price")).getText());
    }

    @Test
    public void SortingHighToLowTest() {
        driver.get(baseUrl + "product-category/windsurfing/");
        sortBy("Sortuj wg ceny: od najwyższej");

        Assertions.assertEquals("5 399,00 zł", find(By.className("price")).getText());
    }
}
