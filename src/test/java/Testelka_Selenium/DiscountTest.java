package Testelka_Selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DiscountTest extends BaseTest {

//    Napisz dwa testy, które przetestują komunikaty dotyczące kuponów na fakestore.testelka.pl.
//    Wprowadź prawidłowy kupont “10procent” i potwierdź że pojawił się komunikat o pomyślnym użyciu kuponu.
//    Wprowadź niesitniejący kupon (np. “test”) i potwierdź, że pojawił się komunikat informujący, że kupon nie istnieje.

    By couponInput = By.id("coupon_code");
    By alertBox = By.className("woocommerce-notices-wrapper");
    String validCoupon = "10procent";
    String invalidCoupon = "test";

    private void useCoupon(String coupon) {
        addItemToCart();
        find(couponInput).sendKeys(coupon);
        find(By.name("apply_coupon")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(alertBox));
    }

    @Test
    public void validDiscountCouponWorks() {
        useCoupon(validCoupon);

        Assertions.assertEquals("Kupon został pomyślnie użyty.", find(By.className("woocommerce-message")).getText());
    }

    @Test
    public void invalidDiscountCouponDoesNotWork() {
        useCoupon(invalidCoupon);

        Assertions.assertEquals("Kupon \"" + invalidCoupon + "\" nie istnieje!", find(By.className("woocommerce-error")).getText());
    }
}
