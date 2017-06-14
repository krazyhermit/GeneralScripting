package generalScripting.Question.Two;

import org.openqa.selenium.WebDriver;

public class PageController {

	PageModel food = null;

	public PageController(WebDriver driver) {
		food = new PageModel(driver);
	}

	public void getFoodName() {
		String food3 = food.foodList().get(2).getText();
		System.out.println(food3);
		String food5 = food.foodList().get(4).getText();
		System.out.println(food5);
		System.out.println();
	}

	public void getFoodServing() {
		food.foodMap();
	}
}
