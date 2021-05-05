package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.*;


public class Test_Steps {
	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable 
	{               
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * System.getProperty("user.dir")+"\\exe\\geckodriver.exe"); driver = new
		 * FirefoxDriver();
		 * driver.get("https://www.worldometers.info/world-population/");
		 * driver.close();
		 */
		System.out.println("HomePage");
		}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		System.out.println("Navigating");
		}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		System.out.println("Entering details");
		}
	@When("User enters UserName={string} and Password={string}")
	public void user_enters_user_name_and_password(String string, String string2) {
			System.out.println(string+string2);
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		System.out.println("logout");
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_Logout_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
	}

}