import java.util.*;
public class Age{
	public static void main(String[] args) {
	boolean correct = false;
	int userAge = 0;
	System.out.println("How old are you?");
	while(correct == false) {
		try {
			Scanner Age = new Scanner(System.in);
			userAge = Age.nextInt();
			correct = true;
		} catch (Exception e) {
			System.out.println("You can only input postitive integers");
		}
	}
	int days = userAge * 365;
	int hours = days * 24;
	int minutes = hours * 60;
	int seconds = minutes * 60;
	System.out.println("You are " + userAge + " years old.");
	System.out.println("That is " + days + " days old.");
	System.out.println("That is " + hours + " hours old.");
	System.out.println("That is " + minutes + " minutes old.");
	System.out.println("That is " + seconds + " seconds old.");
	}
}