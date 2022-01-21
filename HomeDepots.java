/*
*Maxime
*Mr.Pope
*j5 Q2
*April 1 2018
import java.io.*; //importing package of classes
*/
class HomeDepots
{
	public static void main (String[] args)throws IOException
	{
	
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader stdin = new BufferedReader (inStream);
	
		int amount;
		String inData;
		int bolts,nuts,washers;
		double cost;
		double save1, save2, save3;
		int qty1,qty2,qty3;
		double total, tax;

		
		System.out.println("Please enter quantity of bolts");
		inData = stdin.readline();
		amount = Integer.parseInt(inData);
		qty1 = amount;
		if (amount < 50)
		{
			System.out.println("A minimum of 50 bolts must be ordered for the order to process.");
		}
		else
			cost = (amount * 0.05);
			save1 = cost;
		System.out.println("please enter quantity of nuts");
		inData = stdin.readline();
		amount = Integer.parseInt(inData);
		qty2 = amount;
		if (amount < 50)
		{
			System.out.println("A minimum of 50 nuts must be ordered for the order to process.");
		}
		else
			cost = (cost + (amount * 0.05));
			save2 = cost;
		System.out.println("Please enter quantity of washers");
		inData = stdin.readline();
		amount = Integer.parseInt(inData);
		qty3 = amount;
		if (amount < 50)
		{
			System.out.println("A minimum of 50 nuts must be ordered for the order to process.");
		}
		else
			{
			cost = (cost + (amount * 0.02));
			save3 = cost;
		
		}
		total = (save1 + save2 + save3);
		tax = (total * 0.15);
		System.out.println("bolts qty:" + qty1, "price:" + save1);
		System.out.println("nuts qty:" + qty2, "price:" + save2);
		System.out.println("washers qty:" + qty3); System.out.println("price:" + save3);
		System.out.println("The total cost without tax:" + total);
		System.out.println("The total cost with tax:" + (tax + total));
	}
	
}