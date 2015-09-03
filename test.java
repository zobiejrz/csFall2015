import java.util.*;
public class test {

	public static void main(String[] args) {
		Scanner prompt = new Scanner(System.in);
		System.out.println("I am a program that calculates the day of Easter, given the year that you input.");
		System.out.println("What year do you want the day of Easter?");
		int year = prompt.nextInt();

		int a = year % 19;
		int b = year / 100;
		int c = year % 100;
		int d = b / 4;
		int e = b % 4;
		int f = (b + 8) / 25;
		int g = (b - f + 1) / 3;
		int h = ((19 * a)+ b- d - g + 15) % 30;
		int i = c / 4;
		int j = c % 4;
		int k = ((e * 2) + (i * 2) + 32 - h - j) % 7;
		int l = ((h * 11) + (k * 22) + a) / 451;
		int m = l * -7 + h + k + 114;
		int n = m % 31;
		int month = m / 31;
		int day = n + 1;
		String monthWord = "";
		
		switch(month) {
		case 3:
			monthWord = "March";
			break;
		case 4:
			monthWord = "April";
			break;
		default:
			System.out.println("Error! I don't recognize that month!");
			break;
		}
		System.out.println(monthWord + " " + day + ", " + year + " is the date of Easter!");

	}

}
