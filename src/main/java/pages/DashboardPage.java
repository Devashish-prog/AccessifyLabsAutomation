package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtils;

public class DashboardPage {

    private WebDriver driver;
    private By organisationsMenu =
            By.xpath("//a[normalize-space()='Organisations']");

    // Constructor
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By platformOverview =
            By.xpath("//h1[normalize-space()='Platform Overview']");

    private By overviewDescription =
            By.xpath("//p[contains(text(),'Real-time metrics across all organisations')]");

    private By overviewMenu =
            By.xpath("//a[normalize-space()='Overview']");

    

    private By globalSettingsMenu =
            By.xpath("//a[normalize-space()='Global Settings']");

    private By myAccountMenu =
            By.xpath("//a[normalize-space()='My Account']");

    private By search =
            By.cssSelector("input[placeholder='Search...']");

    private By notifications =
            By.cssSelector("button[aria-label='Notifications']");

    private By collapseSidebar =
            By.cssSelector("button[aria-label='Collapse sidebar']");

    private By totalOrganisations =
            By.xpath("//p[normalize-space()='Total Organisations']/following-sibling::p[1]");

    private By totalUsers =
            By.xpath("//p[normalize-space()='Total Users']/following-sibling::p[1]");

    private By completedScans =
            By.xpath("//p[normalize-space()='Completed Scans (Today)']/following-sibling::p[1]");

    private By failedScans =
            By.xpath("//p[normalize-space()='Failed Scans']/following-sibling::p[1]");

    private By growthHeading =
            By.xpath("//h2[normalize-space()='Growth']");

    private By companiesLegend =
            By.xpath("//span[normalize-space()='New Companies']");

    private By usersLegend =
            By.xpath("//span[normalize-space()='New Users']");

    // Platform Overview
    public boolean isPlatformOverviewDisplayed() {
        return WaitUtils.visible(driver, platformOverview).isDisplayed();
    }

    // Description
    public boolean isOverviewDescriptionDisplayed() {
        return WaitUtils.visible(driver, overviewDescription).isDisplayed();
    }

    // Overview menu
    public boolean isOverviewMenuDisplayed() {
        return WaitUtils.visible(driver, overviewMenu).isDisplayed();
    }

    // Search
    public boolean isSearchDisplayed() {
        return WaitUtils.visible(driver, search).isDisplayed();
    }

    // Notifications
    public boolean isNotificationDisplayed() {
        return WaitUtils.visible(driver, notifications).isDisplayed();
    }

    // Collapse sidebar
    public void clickCollapseSidebar() {
        WaitUtils.clickable(driver, collapseSidebar).click();
    }

    // Organisation count
    public String getOrganisationCount() {
        return WaitUtils.visible(driver, totalOrganisations).getText();
    }

    // User count
    public String getUserCount() {
        return WaitUtils.visible(driver, totalUsers).getText();
    }

    // Completed scans
    public String getCompletedScanCount() {
        return WaitUtils.visible(driver, completedScans).getText();
    }

    // Failed scans
    public String getFailedScanCount() {
        return WaitUtils.visible(driver, failedScans).getText();
    }

    // Growth section
    public boolean isGrowthDisplayed() {
        return WaitUtils.visible(driver, growthHeading).isDisplayed();
    }

    // New Companies legend
    public boolean isCompaniesLegendDisplayed() {
        return WaitUtils.visible(driver, companiesLegend).isDisplayed();
    }

    // New Users legend
    public boolean isUsersLegendDisplayed() {
        return WaitUtils.visible(driver, usersLegend).isDisplayed();
    }

    // Navigate to Organisations
    public void clickOrganisations() {
        WaitUtils.visible(driver, organisationsMenu).click();
    }

    // Navigate to Global Settings
    public void clickGlobalSettings() {
        WaitUtils.clickable(driver, globalSettingsMenu).click();
    }

    // Navigate to My Account
    public void clickMyAccount() {
        WaitUtils.clickable(driver, myAccountMenu).click();
    }
}