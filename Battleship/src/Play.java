import java.util.Scanner;

public class Play {

	public static void main(String[] args) {
		
		Ship ship1 = new Ship();
		
		ship1.setLocation(4);
		
		boolean shipFound = false;
		
		while(shipFound==false)
		{
			System.out.print("Guess a location: ");
		    Scanner sc = new Scanner(System.in);
		    int guess = sc.nextInt();
			if(ship1.getLocation(guess)==true)
			{
				shipFound = true;
				System.out.println("You found the ship!");
			}	
			else 
			{
				System.out.println("Try again");
			}
		
		}

	}

}
