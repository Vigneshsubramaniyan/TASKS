package StepDef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import Utilis.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Login;

public class LoginPage extends Base {
	WebDriver driver;
	Login lo;

	@Given("Lauch the browser")
	public void lauch_the_browser() {
		driver = LaunchBrowser();
		maxi();
		iWait(10);
		lo = new Login(driver);
	}

	@Given("open the application")
	public void open_the_application() {
		openURL("https://www.facebook.com/");
	}

	@When("enter the {string} and {string}")
	public void enter_the_and(String username, String password) {
		type(lo.getUsername(), username);
		type(lo.getPassword(), password);
	}

	@When("enter the username and password")
	public void enter_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> asMaps = dataTable.asMaps();
		type(lo.getUsername(), asMaps.get(0).get("username"));
		type(lo.getPassword(), asMaps.get(1).get("password"));
	}

	@When("click the login button")
	public void click_the_login_button() {
		tap(lo.getLogin());
	}

	@Then("validate the login {string} message")
	public void validate_the_login_message(String msg) {
		System.out.println(msg);
		closeBrowser();
	}

}
