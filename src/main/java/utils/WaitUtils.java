package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

    private static final int DEFAULT_TIMEOUT = 15;

    public static WebElement visible(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(15)
        );

        return wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        );
    }

    public static WebElement clickable(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(DEFAULT_TIMEOUT)
        );

        return wait.until(
                ExpectedConditions.elementToBeClickable(locator)
        );
    }

    public static boolean urlContains(WebDriver driver, String urlPart) {
        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(DEFAULT_TIMEOUT)
        );

        return wait.until(
                ExpectedConditions.urlContains(urlPart)
        );
    }

    public static boolean titleContains(WebDriver driver, String title) {
        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(DEFAULT_TIMEOUT)
        );

        return wait.until(
                ExpectedConditions.titleContains(title)
        );
    }
}