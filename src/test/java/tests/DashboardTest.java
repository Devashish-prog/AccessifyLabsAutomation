package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;
import utils.DriverFactory;

public class DashboardTest {

    @BeforeMethod
    public void setUp() {

        DriverFactory.initializeDriver();

        DriverFactory.getDriver().get("https://altool.projectdevelopment.co/");

        LoginPage loginPage =
                new LoginPage(DriverFactory.getDriver());

        loginPage.login(
                "admin@demo.com",
                "admin123"
        );
    }

    @Test
    public void Organisations() {

    	DashboardPage dashboardPage=new DashboardPage(DriverFactory.getDriver());
    	dashboardPage.clickOrganisations();
        

        // Wait until Dashboard is loaded
        Assert.assertTrue(
                dashboardPage.isPlatformOverviewDisplayed(),
                "Dashboard was not loaded"
        );

        // Click Organisations
        dashboardPage.clickOrganisations();

        // Verify URL
        Assert.assertTrue(
                utils.WaitUtils.urlContains(
                        DriverFactory.getDriver(),
                        "/admin/organisations"
                ),
                "Organisations page was not opened"
        );
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}