package objectPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By btn_item_info = By.xpath(
			"//body[1]/main[1]/header[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/a[1]/span[1]");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void item() {
		driver.findElement(btn_item_info).click();
	}
}
