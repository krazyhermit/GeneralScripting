/* General scripting / logic
 * Question 2
 * Developed by Mohammad Nazmul Haq
 */

package generalScripting.Question.Two;

import org.testng.annotations.Test;

public class FoodTest extends DriverScript {

	@Test
	public void findingFoodTest() {
		foodTest().getFoodName();
	}

	@Test
	public void foodsServingTest() {
		foodTest().getFoodServing();
	}
}
