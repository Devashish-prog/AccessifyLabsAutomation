package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.basetest;
import pages.DashboardPage;
import pages.LoginPage;
import pages.OrganisationsPage;

public class LoginTest extends basetest {

    LoginPage loginPage;
    DashboardPage dashboardPage;

    @BeforeMethod
    public void setUpTest() {

        setup();

        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
    }

    @Test
    public void validLoginTest() {

        loginPage.login(
                "admin@demo.com",
                "admin123"
        );

        Assert.assertTrue(
                dashboardPage.isPlatformOverviewDisplayed(),
                "Platform Overview is not displayed after login"
        );
    }

    @Test
    public void navigateToOrganisationsTest() {

        loginPage.login(
                "admin@demo.com",
                "admin123"
        );

        dashboardPage.clickOrganisations();
        OrganisationsPage organisationsPage = new OrganisationsPage(driver);
        organisationsPage.clickCreateOrganisation();

        
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page title: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDownTest() {

        tearDown();
    }
}