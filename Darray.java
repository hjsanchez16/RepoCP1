import java.util.Random;

public class Darray{

	public static void main(String[] args)
	{
	
	System.out.println("Welcome to Array Game! Move your Sprite x to the * to win");

	int rows = 4;
	int columns = 4;

	char[][] array = new char[rows][columns];

	for(int i = 0; i<rows; i++)
    		for(int j = 0; j<columns; j++)
        		array[i][j] = '0';
		
		array[0][0] = 'X';

	Random random = new Random();
        int randomNum = random.nextInt(4);
	int randomNum2 = random.nextInt(4);
        array [randomNum][randomNum2] = '*';


	for(int i = 0; i<rows; i++)
	{
    		for(int j = 0; j<columns; j++)
    		{
        		System.out.print(array[i][j]);
    		}
    		System.out.println();
    
        }
}
   	String moveSelect;
   	boolean validInput = true;
		System.out.println("Enter a movement choice W A S or D");
do{

    Scanner keyboard = new Scanner(System.in);
    moveSelect = keyboard.nextLine();

    if ( moveSelect.equals("W"))
    {
        j -= 1;
        validInput = true;
        
    }

    else if ( moveSelect.equals("a"))
    {
       i -= 1;
        validInput = true;
        
    }

    else if ( moveSelect.equals("s"))
    {
        j += 1;
        validInput = true;
    }

    else if (moveSelect.equals("d"))
    {
        i -= 1;
        validInput = true;
    }

    else
    {(
        System.out.println("Invalid Entry. Try again.");
        validInput = false;
    }

} while (validInput == false);
Darray[i][j] = 'X';
gridArray[i2][j2] = '*';


} 

   }