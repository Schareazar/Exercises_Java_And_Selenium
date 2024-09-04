package Testelka_Selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PaymentTest extends BaseTest {

//    Napisz test, który potwierdzi, że użytkownik ma możliwość dokonania zakupu bez zakładania konta (na fakestore.testelka.pl).
//    Numer karty, który możesz użyć do sfinalizowania płatności, zobaczysz na stronie płatności (zaraz nad polem do wprowadzenia numeru karty).

    private void placeOrder() {
        wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id='stripe-card-element']//iframe"))));
        find(By.id("billing_first_name")).sendKeys("Name");
        find(By.id("billing_last_name")).sendKeys("Surname");
        find(By.id("billing_address_1")).sendKeys("Street 1");
        find(By.id("billing_postcode")).sendKeys("11-111");
        find(By.id("billing_city")).sendKeys("City");
        find(By.id("billing_phone")).sendKeys("600600600");
        find(By.id("billing_email")).sendKeys("test@test.test");
        driver.switchTo().frame(find(By.xpath("//*[@id='stripe-card-element']//iframe")));
        find(By.name("cardnumber")).sendKeys("4242424242424242");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(find(By.xpath("//*[@id='stripe-exp-element']//iframe")));
        find(By.name("exp-date")).sendKeys("12/34");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(find(By.xpath("//*[@id='stripe-cvc-element']//iframe")));
        find(By.name("cvc")).sendKeys("123");
        driver.switchTo().defaultContent();
        find(By.id("terms")).click();
        find(By.id("place_order")).click();
    }

    @Test
    void paymentWithGuestAccount() {
        addItemToCart();
        find(By.className("checkout-button")).click();
        placeOrder();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("woocommerce-order")));

        Assertions.assertEquals("Dziękujemy. Otrzymaliśmy Twoje zamówienie.",
                find(By.className("woocommerce-thankyou-order-received")).getText());
    }
}
