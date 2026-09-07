package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.WaitUtils;

public class OrganisationsPage {

    private WebDriver driver;

    public OrganisationsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Create Organisation button
    private By createOrganisationButton =
            By.xpath("//button[contains(normalize-space(), 'Create Organisation')]");

    // Organisation fields
    private By organisationName =
            By.id("organisation-name");

    private By organisationIndustry =
            By.id("organisation-industry");

    private By auditCheckbox =
            By.id("audit-checkbox");

    private By auditLimit =
            By.id("audit-limit");

    private By scanCheckbox =
            By.id("scan-checkbox");

    private By scanLimit =
            By.id("scan-limit");

    // Customer Contact
    private By customerName =
            By.id("customer-name");

    private By customerEmail =
            By.id("customer-email");

    private By customerPhone =
            By.id("customer-phone");

    // Default Company Admin
    private By adminFirstName =
            By.id("admin-first-name");

    private By adminLastName =
            By.id("admin-last-name");

    private By adminUsername =
            By.id("admin-username");

    private By adminPassword =
            By.id("admin-password");

    // Next button
    private By nextButton =
            By.id("organisation-drawer-submit");


    // Click Create Organisation
    public void clickCreateOrganisation() {

        WaitUtils.visible(driver, createOrganisationButton).click();
    }


    // Fill Create Organisation form
    public void fillCreateOrganisationForm() {

        // Organisation Name
        WaitUtils.visible(driver, organisationName)
                .sendKeys("Acme Corporation");


        // Industry
        Select industry = new Select(
                WaitUtils.visible(driver, organisationIndustry)
        );

        industry.selectByValue("technology");


        // Audit
        if (!driver.findElement(auditCheckbox).isSelected()) {
            driver.findElement(auditCheckbox).click();
        }

        WaitUtils.visible(driver, auditLimit).clear();

        WaitUtils.visible(driver, auditLimit)
                .sendKeys("25");


        // Scan
        if (!driver.findElement(scanCheckbox).isSelected()) {
            driver.findElement(scanCheckbox).click();
        }

        WaitUtils.visible(driver, scanLimit).clear();

        WaitUtils.visible(driver, scanLimit)
                .sendKeys("500");


        // Customer Contact
        WaitUtils.visible(driver, customerName)
                .sendKeys("John Smith");

        WaitUtils.visible(driver, customerEmail)
                .sendKeys("john@acme.com");

        WaitUtils.visible(driver, customerPhone)
                .sendKeys("+1 555 000 0000");


        // Default Company Admin
        WaitUtils.visible(driver, adminFirstName)
                .sendKeys("John");

        WaitUtils.visible(driver, adminLastName)
                .sendKeys("Smith");

        WaitUtils.visible(driver, adminUsername)
                .sendKeys("admin@acme.com");

        WaitUtils.visible(driver, adminPassword)
                .sendKeys("Acme@Admin123");
    }


    // Click Next
    public void clickNext() {

        WaitUtils.visible(driver, nextButton).click();
    }
}