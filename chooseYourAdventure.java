import java.util.*;

public class chooseYourAdventure
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner prompt = new Scanner (System.in);
		
		System.out.println("You are walking home from your job at the city morgue.");
		System.out.println("Suddenly, you see a dark figure jump in front of you!");
		System.out.println("Do you fight, or talk to the dark stranger?");
		String firstPrompt = prompt.nextLine().toLowerCase();
		
		switch (firstPrompt) {
		case "!":
			System.out.println ("!");
			case "fight":
				System.out.println ("You sneak up behind the stranger, pick up a nearby pipe,\n" +
									"and attack the stranger!\n" + 
									"But suddenly, the stranger turns around and holds you at gun point! You see that it is" +
									"\nRoboCop!" +
									"RoboCop mutters something into his ear piece, and tells you that you will go to," +
									"Electricity runs up and down his body and RoboCop is knocked out! A second stranger comes up to you and \nasks if you want to run or stay." +
									"Do you 'stay' or 'run'?");
				String fightPrompt = prompt.nextLine().toLowerCase();
				switch (fightPrompt) {
					case "stay":
						System.out.println ("You tell the stranger no, you will take the consequences of your actions.");
						System.out.println ("The stranger walks away and RoboCop wakes up, arrests you, and you are taken to jail for \nassaulting an officer.");
						System.out.println ("\nYou spend the rest of your life in prison.\nThe End!");
						break;
					case "run":
						System.out.println ("You run with the stranger, who you see is the infamous Deadshot!");
						System.out.println ("He says that he can get you into prison for a phony sentence, and you can join the Suicide Six!");
						System.out.println ("You ask what you would do, and he replies that they have connections that can still make him a RoboCop type person.");
						System.out.println ("Do you 'continue' running or 'stop' running, and go home?");
					break;
					default:
						System.out.println ("I am a dumb computer and don't know what that means.");
					break;
				}
				break;
			case "talk":
				System.out.println ("You shout the stranger asking who they are.");
				System.out.println ("He turn around and you see that it is RoboCop! He asks you if you know the location of John Bartholmew, your friend.");
				System.out.println ("You don't want to get John in trouble, but you also don't want to get arrested for lying to RoboCop.");
				System.out.println ("Do you either 'tell' or 'lie'?");
				String talkPrompt = prompt.nextLine().toLowerCase();
				switch (talkPrompt) {
					case "tell":
						System.out.println ("You tell that John is your neighbor, and will be driving home on this street in about 5 minutes.");
						System.out.println ("6 minutes later, John is arrested and taken to jail for identity theft.");
						System.out.println ("RoboCop takes you aside and says that OCP is looking for an undamaged test subject to be the next RoboCop.");
						System.out.println ("Do you say 'yes' or 'no' to this offer?");
						break;
					case "lie":
						System.out.println ("You lie to RoboCop, but because of his advanced software he arrests you for lying to an officer!");
						System.out.println ("You are taken to jail for the rest of your life.");
						System.out.println ("\nThe End!");
						break;
					default:
						System.out.println ("I am a dumb computer and don't know what that means.");
					break;
				}
				break;
			default:
				System.out.println ("I'm a dumb computer, so I can only understand 'fight' or 'talk'.");
		}
		prompt.close();
	}

}
