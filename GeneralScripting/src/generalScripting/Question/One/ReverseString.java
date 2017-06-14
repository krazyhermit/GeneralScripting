/* General scripting / logic
 * Question 1
 * Developed by Mohammad Nazmul Haq
 */

package generalScripting.Question.One;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter your string: ");
		str = s.nextLine();
		System.out.print("Reverse String of " + "'" + str + "'" + " is: ");
		reverseEverything(str);
	}

	public static void reverseEverything(String s) {
		char[] ch = s.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}
