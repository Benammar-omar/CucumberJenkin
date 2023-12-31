package objectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By field_email = By.xpath("//input[@id='field-email']");
	By field_password = By.xpath("//input[@id='field-password']");
	By btn_login = By.xpath("//button[@id='submit-login']");
	By error_msg = By.xpath("//li[contains(text(),\"Échec d'authentification\")]");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enter_email(String email) {
		driver.findElement(field_email).sendKeys(email);
	}

	public void enter_password(String password) {
		driver.findElement(field_password).sendKeys(password);
	}

	public void click_login() {
		driver.findElement(btn_login).click();
	}

	public void error_check() {
		driver.findElement(error_msg).isDisplayed();
	}
}
