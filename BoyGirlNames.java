import java.io.*;
import java.util.*;

public class BoyGirlNames 
{

	public static void main(String[] args)
	{
		Scanner inputStream1 = null;
		Scanner inputStream2 = null;

		try 
      {

			inputStream1 = new Scanner(new FileInputStream("girlnames.txt"));
			inputStream2 = new Scanner(new FileInputStream("boynames.txt"));

			String girl[] = new String[1000];
			String boy[] = new String[1000];

			int ranking1[] = new int[1000];
			int ranking2[] = new int[1000];
			int i = 0;
			while (inputStream1.hasNext() && inputStream2.hasNext()) 
         {
				for (i = 0; i < 1000; i++) {
					girl[i] = inputStream1.next();
					boy[i] = inputStream2.next();
					ranking1[i] = inputStream1.nextInt();
					ranking2[i] = inputStream2.nextInt();
					System.out.println(inputStream1);
					System.out.println(inputStream2);
				}// End for loop.

				String name;
				Scanner userInput = new Scanner(System.in);
				System.out.println("Enter a name");
				name = userInput.nextLine();
				
				boolean flag = false;
				for (i = 0; i < 1000; i++)
             {
					if (girl[i].equalsIgnoreCase(name))
                {
						System.out.println(name + " is ranked " + (i + 1)
								+ " in popularity among girls with "
								+ ranking1[i] + " " + "namings.");
							flag = true;
					}// End if statement
					
				}// End for loop
				if (flag == false)
				{
					System.out.println(name + " " + "is not ranked among the top 1000 girl names.");
				}
				flag = false;
				for (i = 0; i < 1000; i++)
				{
					if (boy[i].equalsIgnoreCase(name)) {
						System.out.println(name + " is ranked " + (i + 1)
								+ " in popularity among boys with "
								+ ranking2[i] + " " + "namings");
					flag = true;
					}// End if statement
					
				}//End for loop.
				if (flag == false)
				{
					System.out.println(name + "is not ranked among the top 1000 boy names.");
				}//End if statement.
			}// End while loop.
		}// End try block.
		catch (FileNotFoundException e) 
		{
			System.out.println("The "+ e.getMessage() + " was not found.");
			System.exit(0);

		}// End catch block.

		inputStream1.close();
		inputStream2.close();

	}// End class.

}// End class.
