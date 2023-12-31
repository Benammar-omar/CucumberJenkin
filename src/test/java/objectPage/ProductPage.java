package objectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	By btn_addto_cart = By.xpath(
			"//body/main[@id='page']/section[@id='wrapper']/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/section[1]/div[1]/div[2]/div[6]/div[1]/form[1]/div[2]/div[1]/div[2]/button[1]");
	By cart = By.xpath("//body/div[5]/div[2]/div[1]/div[1]");

	public void add_to_cart() {
		driver.findElement(btn_addto_cart).click();
	}

	public void check_cart() {
		driver.findElement(cart).isDisplayed();
	}

}
