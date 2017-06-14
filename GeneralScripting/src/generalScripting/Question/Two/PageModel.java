package generalScripting.Question.Two;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageModel {

	WebDriver driver;

	public PageModel(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> foodList() {
		List<WebElement> foods = driver.findElements(By.xpath("//span[@ng-bind='food.name']"));
		return foods;
	}

	public void foodMap() {
		List<WebElement> totalElements = driver.findElements(By.xpath("//span[contains(@ng-bind,'food')]"));
		int size = totalElements.size();
		List<WebElement> foodName = driver.findElements(By.xpath("//span[@ng-bind='food.name']"));
		List<WebElement> servings = driver.findElements(By.xpath("//span[@ng-bind='food._servingDesc']"));

		for (int i = 0; i < foodName.size(); i++) {
			String str = foodName.get(i).getText();
			String str1 = servings.get(i).getText();
			System.out.println(str + "  " + str1);
		}
		System.out.println();
	}

}
