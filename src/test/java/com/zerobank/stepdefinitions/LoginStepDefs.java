package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.id("signin_button")).click();
    }
    @Given("User logins with username {string} and password {string}")
    public void user_logins_with_username_and_password(String u, String p) {
        loginPage.login(u,p);
    }
    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String string) {

    }
}
