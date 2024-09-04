package Testelka_Selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;
    WebDriverWait wait;
    String baseUrl = "https://fakestore.testelka.pl/";

    @BeforeEach
    public void setup() {
        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless=new");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    public WebElement find(By locator)
    {
       return driver.findElement(locator);
    }

    public void closeWarning()
    {
        find(By.className("woocommerce-store-notice__dismiss-link")).click();
    }

    void addItemToCart() {
        driver.get(baseUrl);
        closeWarning();
        find(By.className("add_to_cart_button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("added_to_cart"))).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("coupon_code")));
    }
}
