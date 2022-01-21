/*Computer science 120
*Mr.Pope
*Max
*2018 - 06 - 04
*This program asks the user for 2 names and determine if the have equal number of characters
*/

import java.io.*;
public class Name
{
	public static void main (String[]args)throws IOException
	{

	String Name1; 
	String Name2;

	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader (inStream);

	Name1 = stdin.readLine();
	
	//InputStreamReader inStream = new InputStreamReader(System.in);
	//BufferedReader stdin = new BufferedReader (inStream);

	Name2 = stdin.readLine();

	int num1 = (Name1.length());
	int num2 = (Name2.length());

	if (num1 >= num2)
	System.out.println((num1 - num2));
	if (num1 <= num2)
	System.out.println((num2 - num1)); 
   }
}