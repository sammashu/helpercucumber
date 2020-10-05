package stepDefinitions;

import entities.MyValueClass;
import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class stepDefinition {

    @DataTableType
    public MyValueClass myValueEntry(Map<String, String> entry){
        return new MyValueClass(entry.get("name"), entry.get("password"), entry.get("email"), entry.get("country"), entry.get("number"));
    }

    @ParameterType(".*")
    public MyValueClass myValueClass(String name){
        return new MyValueClass(name, null, null, null, null);
    }

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("navigated to login url");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_and(String string, String string2) {
        System.out.println("Login success  with username " + string + " and password " + string2 );
    }


    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("Validated home page");
    }

    @And("^Cards are displayed (true|false)$")
    public void cards_are_displayed(boolean isDisplayed) throws Throwable {
        System.out.println("Card displayed " + isDisplayed);
    }

    @When("^User sign up with the following details$")
    public void user_sign_up_with_the_following_details(List<MyValueClass> myValueClasses) throws Throwable {
        for (MyValueClass v: myValueClasses) {
            System.out.println(v.toString());
        }
    }

    @When("User sign up with the following name as {myValueClass}")
    public void user_sign_up_with_the_following_details2(MyValueClass myValueClasses) throws Throwable {
        System.out.println(myValueClasses.toString());
    }

    @When("^User sign up with the following (.+) and (.+)$")
    public void user_sign_up_with_the_following_details3(String username, String password) throws Throwable {
        System.out.println(username + " " + password);
    }

    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("validate_the_browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("browser_is_triggered");
    }

    @Then("^check if browser is displayed")
    public void check_if_browser_started() throws Throwable {
        System.out.println("check_if_browser_started");
    }

}
