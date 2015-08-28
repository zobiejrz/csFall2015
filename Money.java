import java.util.*;
public class Money
{
	public static void main(String[] args)
	{
		Scanner prompt = new Scanner(System.in);
		int userSalary = 0;
		
		System.out.println("What is your name?");
		String userName = prompt.nextLine();
	

		while(true)
		{
			
			System.out.println("What is your desired salary?");
			if (prompt.hasNextInt())
			{
				userSalary = prompt.nextInt();
				break;
			}

			prompt.next();
			System.out.println("Can only do positive integers.");
			
		}
		int quarters = userSalary * 4;
		int dimes = userSalary * 10;
		int nickles = userSalary * 20;
		int pennies = userSalary * 100;
		
		System.out.println(userName + "\'s desired salary");
		System.out.println("$" + userSalary + ".00");
		System.out.println("Which is " + quarters + " quarters.");
		System.out.println("Which is " + dimes + " dimes.");
		System.out.println("Which is " + nickles + " nickles.");
		System.out.println("Which is " + pennies + " pennies.");

	}
}
