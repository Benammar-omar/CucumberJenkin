package definitionSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectPage.HomePage;
import objectPage.ItemPage;
import objectPage.LoginPage;
import objectPage.ProductPage;

public class Steps {
	WebDriver driver;

	@Before
	public void browserSetup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() {
//		driver.close();
		System.out.println("c'est le after");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.get("https://tunisiatech.tn/connexion?back=my-account");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_email_and_password(String email, String password) {
		LoginPage lg = new LoginPage(driver);
		lg.enter_email(email);
		lg.enter_password(password);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		LoginPage lg = new LoginPage(driver);
		lg.click_login();
	}

	@Then("user on the website")
	public void user_on_the_website() {
	}

	@When("^user try to enters (.*) and (.*)$")
	public void user_try_to_enters_email_and_password(String email, String password) {
		LoginPage lg = new LoginPage(driver);
		lg.enter_email(email);
		lg.enter_password(password);
	}

	@Then("user can not navigated to home page")
	public void user_can_not_navigated_to_home_page() {
		LoginPage lg = new LoginPage(driver);
		lg.error_check();
	}

	@When("the user clicks on specific item")
	public void the_user_clicks_on_specific_item() {
		HomePage hm = new HomePage(driver);
		hm.item();
	}

	@When("the user selects a specific product")
	public void the_user_selects_a_specific_product() {
		ItemPage it = new ItemPage(driver);
		it.select_product();
	}

	@Then("the user should be on the product page")
	public void the_user_should_be_on_the_product_page() {
	}

	@When("the user add the product to the Cart")
	public void the_user_add_the_product_to_the_Cart() {
		ProductPage product = new ProductPage(driver);
		product.add_to_cart();
	}

	@Then("the cart should contain the added product")
	public void the_cart_should_contain_the_added_product() {
		ProductPage product = new ProductPage(driver);
		product.check_cart();
	}
}
