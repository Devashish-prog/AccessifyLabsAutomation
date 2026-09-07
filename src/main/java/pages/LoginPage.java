package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class LoginPage {

    private WebDriver driver;

    private By usernameField = By.id("username");

    private By passwordField = By.id("password");

    private By loginButton = By.cssSelector("button[type='submit']");

    private By forgotPassword = By.linkText("Forgot password?");

    private By passwordVisibilityButton =
            By.cssSelector("button[aria-label='Hide password']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        WaitUtils.visible(driver, usernameField).sendKeys(email);
    }

    public void enterPassword(String password) {
        WaitUtils.visible(driver, passwordField).sendKeys(password);
    }

    public void clickLogin() {
        WaitUtils.visible(driver, loginButton).click();
    }

    public void clickForgotPassword() {
        WaitUtils.visible(driver, forgotPassword).click();
    }

    public void clickPasswordVisibility() {
        WaitUtils.visible(driver, passwordVisibilityButton).click();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLogin();
    }
}