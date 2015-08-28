import java.util.*;
public class Feeling{
	public static void main(String[] args) {
	
	
	Scanner prompt = new Scanner(System.in);
	Scanner name = new Scanner(System.in);
	String userInput;
	String userName;
	System.out.println("What is your name?");
	userName = prompt.nextLine().toUpperCase();
	System.out.println("How do you feel?");
	userInput = prompt.nextLine().toLowerCase();
	
	
	switch(userInput)  {
	
		case "good":
			System.out.println(userName + ", share your joy with the world!");
			break;
		case "sad":
			System.out.println("I hope you feel better, " + userName);
			break;
		case "awesome":
			System.out.println("that is AMAZING!!!!");
			break;
		case "bored":
			System.out.println("You could try playing outside or reading a book, " + userName);
			break;
		default:
			System.out.println("I don't know what that means. \nI can only take 'Good', 'Bad', 'Bored', or 'Awesome' for input.");
			break;
		}
	}
}