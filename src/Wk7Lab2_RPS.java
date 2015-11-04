
import java.util.Random;	
import java.util.Scanner;

public class Wk7Lab2_RPS 
{
	public static void main( String[] args )
	{
		Random random = new Random();
		
		
		Scanner scanner = new Scanner( System.in );
		
		int userChoice, computerChoice;
		
		System.out.println("Enter move (0 = Rock; 1 = Paper; 2 = Sissor):");
		userChoice = scanner.nextInt();
				
		if(userChoice < 0 || userChoice > 2)
		{
			System.out.println("Invalid choice, ending program");
			System.exit(0);
		}
		
		computerChoice = random.nextInt(3);
		
		if(userChoice == computerChoice)
		{
			if(userChoice == 0)
			{
				System.out.println("Both player chose rock!");				
			}
			else if(userChoice == 1)
			{
				System.out.println("Both player chose paper!");
			}
			else
			{
				System.out.println("Both player chose sissors!");
			}
				
			System.exit(0);
		}
			
		if(userChoice == 0)
		{
			if(computerChoice == 1)
			{
				System.out.println("You chose rock; Computer chose paper!");
				System.out.println("Computer wins!");
			}
			else
			{
				System.out.println("You chose rock; Computer chose sissors");
				System.out.println("You win!");
			}
		}
		
		else if(userChoice == 1)
		{
			if(computerChoice == 0)
			{
				System.out.println("You chose paper; Computer chose rock!");
				System.out.println("You win!");
			}
			else
			{
				System.out.println("You chose paper; Computer chose sissors!");
				System.out.println("Computer win!");
			}
		}
		else
		{
			if(computerChoice == 0)
			{
				System.out.println("You chose sissors; Computer chose rock!");
				System.out.println("Computer win!");
			}
			else
			{
				System.out.println("You chose sissors; Computer chose paper!");
				System.out.println("You win!");
			}
		}
		
		scanner.close();
		
	}	
}



