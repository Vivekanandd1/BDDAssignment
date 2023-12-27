package Demo.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {
	
	WebDriver driver;
	@Given("User landed on login page")
	public void user_landed_on_login_page() {
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enter the credentials")
	public void user_enter_the_credentials() {
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@And("User click on login button")
	public void user_click_on_login_button() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User landed on Homepage")
	public void user_landed_on_homepage() {
	   System.out.println(driver.getTitle());
	}

}
