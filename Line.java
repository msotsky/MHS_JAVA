/* Computer science 120
*Mr.Pope
*Max
*2018 - 07 - 05
*This program asks user to input some characters then count the characters inputed
*/

import java.io.*;
public class Line
{

	public static void main (String[]args)throws IOException
	{

	String letters;
	
	System.out.println("Please enter anything, press . and enter to if you want to stop");
	
	InputStreamReader inStream = new InputStreamReader(System.in);
	BufferedReader stdin = new BufferedReader (inStream);

	letters = stdin.readLine();
	int i;
	int num =0;

	for(i = 0;!letters.equals("."); i++)
		letters = stdin.readLine();
		System.out.println(letters.charAt(i));
		num += letters.length();
		System.out.println("There is " +num +" characters.");
			
	}
}

	