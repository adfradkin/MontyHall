import java.util.Scanner;
public class MontyHall
{
	public static void main(String[] args)
	{
		description();
		game();
	}
	public static void description()
	{
		System.out.println("Welcome to the Monty Hall Game.");
		System.out.println("There is a car hidden in one of the three doors.");
		System.out.print(" Pick a door now and you will have a chance to switch");
		System.out.println(" later.");
	}
		
	public static void game()
	{
		Scanner keyboard = new Scanner(System.in);
		int car = (int)(Math.random()*3+1);
		//Testing
		//System.out.println("car = " + car);
		int userPick = keyboard.nextInt();
		System.out.println("Please Choose A Number Box: ");	
		keyboard.nextLine();
		// Testing
		//System.out.println("user pick = " + userPick);
		int reveal = doorToReveal(car, userPick);	
		System.out.println("The door number " + reveal + " Is empty");
		System.out.println("Do you want to switch door?(Yes or No)");
		String answer = keyboard.nextLine();
		int newPick = (int)(Math.random()*3+1);
		if (answer == "Yes" || answer == "yes")
		{
			while (newPick == reveal || newPick == userPick)
			{
				newPick = (int)(Math.random()*3+1);
				userPick = 0;
			}			
			
		}
		else
		{
			newPick = 0;
		}
		if (userPick == car || newPick == car)
		{
			System.out.println("Congrats! You won a car! ");
		}
		else	
		{
			System.out.println("Sorry but you got the goat...");
		}
		
		
	}
	/**
	* This method returns the door number that is 
	* either that the the car is in nor the user's pick
	*@param c the foor the car is in
	*@param u the foor number that the user picked
	@return int
	*/
	
	public static int doorToReveal(int c, int u)
	{
		int door = (int)(Math.random()*3+1);
		while(door == c || door == u)
		{
			door = (int)(Math.random()*3+1);
			
		}
		return door;
	}
		
	
}
	 