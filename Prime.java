/*
*Maxime
*Mr.Pope
*j5 Q2
*April 1 2018
*/
import java.io.*;
class Prime
{
	public static void main (String[] args)throws IOException
	{
	
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader (inStream);
	
		double num;
		String inData;
		int count;
		
		inData = stdin.readLine();
		num = Integer.parseInt(inData);
		
		if (num == 2)
		System.out.println("Number is prime");
		
		for (count = 2; count < num; count++)
		{

		if ( (num % count) == 0 ){
			System.out.println("Number is not prime");
			break;
			}
		}
		
			System.out.println("Number is prime");

		//}else{
			//System.out.println("Number is prime");
			//break;
// num = Math.round(num * 100.0) / 100.0;
// if not divisible by 2 , 3 , 5 , 7 its prime


	}
}