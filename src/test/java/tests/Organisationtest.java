package tests;

import org.testng.annotations.Test;

import Base.basetest;
import pages.OrganisationsPage;
public class Organisationtest extends basetest
{

@Test

public void CreateOrganisationTest() 
{
	OrganisationsPage organisationPage = new OrganisationsPage(driver);
	organisationPage.clickCreateOrganisation();
	organisationPage.fillCreateOrganisationForm();
	organisationPage.clickNext();
	

}}
