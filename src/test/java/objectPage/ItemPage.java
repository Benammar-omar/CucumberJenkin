package objectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {
	WebDriver driver;

	public ItemPage(WebDriver driver) {
		this.driver = driver;
	}

	By btn_select_product = By.xpath("//*[@id=\"js-product-list\"]/div[1]/div/div[2]/article/div[1]/div[1]/a");

	public void select_product() {
		driver.findElement(btn_select_product).click();
	}
}
